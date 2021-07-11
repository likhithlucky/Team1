package com.abc.healthcenter.service;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.abc.healthcenter.entity.NewsEntity;
import com.abc.healthcenter.exception.ResourceAlreadyExistException;
import com.abc.healthcenter.exception.ResourceNotFoundException;
import com.abc.healthcenter.model.News;

import com.abc.healthcenter.repository.NewsRepository;

/**
 * 
 * @author venkatesh
 *
 *Date : 06-Jul-2021
 */
@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsRepository newsRepository;
	
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NewsServiceImpl.class);

    /**
     * Implement save news details from newsService Interface
     * {@inheritDoc}
     */
	@Override
	public News saveNews(News news) throws ResourceAlreadyExistException {
		
		LOGGER.info("newsRepository::findbyId(int id) method called");
		
		Optional<NewsEntity> newsEntity1 = newsRepository.findById(news.getNewsId());
		if(newsEntity1.isPresent()) {
			LOGGER.error("ResourceAlreadyExistException encountered with id"+news.getNewsId());
		throw new ResourceAlreadyExistException("News is already exist with this Id"+news.getNewsId());

	}
	else {
		NewsEntity newsEntity = convertModeltoEntity(news);
		
		NewsEntity returnednewsEntity = newsRepository.save(newsEntity);
		
		News NewsModel = convertEntitytoModel(returnednewsEntity);
		
		
		LOGGER.info("News details saved in repository");
		LOGGER.info("Exiting from NewsServiceImp::saveNews(News news)method");
		return NewsModel;
		
	
	}
		
	}
	/**
	 * implements deleteNewsbyId from NewsService interface
     * {@inheritDoc}
     */
	@Override
	public void deleteNewsbyId(int id) throws ResourceNotFoundException {
		
		LOGGER.info("FindById method called from NewserviceImp::deleteNewsbyId method");
		
		Optional<NewsEntity> newsEntity = newsRepository.findById(id);
		if(newsEntity.isPresent()) {
			newsRepository.deleteById(id);
			LOGGER.info("DELETED the given News Details");
		}
		else {
			LOGGER.error("ResourceNotFoundException encountered with id "+id);
			throw new ResourceNotFoundException ("can not find News with this Id "+id);
		}
		LOGGER.info("Exiting from NewsServiceImp::deleteNewsbyId(int id)method");
	}
	/**
	 * implements uopdateNewsbyId from NewsService interface
     * {@inheritDoc}
     */
	@Override
	public void updateNewsbyId(News news) throws ResourceNotFoundException {
		
		LOGGER.info("FindById method called from NewsServiceImp::updateNewsbyId method");
		
		NewsEntity newsEntity =newsRepository.findById(news.getNewsId()).get();
		if(newsEntity == null) {
			LOGGER.error("ResourceNotFoundException encountered with id "+news.getNewsId());
			
			throw new ResourceNotFoundException ("can not find News with this Id"+news.getNewsId());
			
		}
		else {
			newsEntity.setNewsId(news.getNewsId());
			newsEntity.setNewsHeader(news.getNewsHeader());
			newsEntity.setNewsBody(news.getNewsBody());;
			newsEntity.setNewsContact(news.getNewsContact());
			newsRepository.save(newsEntity);
			LOGGER.info("News Details are updated");
		}
		LOGGER.info("Exiting from NewsServiceImp::updateNewsbyId(News news)method ");
	}
	
	/**
	 * implements findNewsbyId from DoctorService interface
	 * {@inheritDoc}
	 */
	@Override
	public News findNewsbyId(int id) throws ResourceNotFoundException {
		
		LOGGER.info("newsRepository::findbyId method calling from NewsService::FindNewsbyId");
		
		Optional<NewsEntity> newsEntity = newsRepository.findById(id);
		if(newsEntity.isPresent()) {
			
			News news = convertOptionalEntitytoModel(newsEntity);
			LOGGER.info("returned news object to Newscontroller::findnews(int id) method");
			return news;
		}
		else {
			LOGGER.error("ResourceNotFoundException encounterd with Id" +id);
			throw new ResourceNotFoundException("can not find news with this id "+id);
		}
		}
		
		/**
		 * implements finding news by header from news service interface
		 * {@inheritDoc}
		 */
		@Override
		public News findNewsbyHeader(String header) throws ResourceNotFoundException {
			LOGGER.info("findbyheader method called fron newsserviceImp::findNewsbyHeader method");
			
			Optional<NewsEntity> newsEntity =newsRepository.findByNewsHeader(header);
			if(newsEntity.isPresent()) {
				
				News news = convertOptionalEntitytoModel(newsEntity);
				LOGGER.info("requested news to create and returned");
				return news;
			}
			
			else {
				LOGGER.info("ResourceNotFoundException encountered with header "+header);
				throw new ResourceNotFoundException("can not find news with this header "+header);
			}
		}
		
	
	
	/**
	 * this methods convert model to entity
	 * @param news
	 * @return
	 */
	private NewsEntity convertModeltoEntity(News news) {
		NewsEntity newsEntity = new NewsEntity();
		newsEntity.setNewsId(news.getNewsId());
		newsEntity.setNewsHeader(news.getNewsHeader());
		newsEntity.setNewsBody(news.getNewsBody());
		newsEntity.setNewsContact(news.getNewsContact());
		newsEntity.setAdminId(news.getAdminId());
	
		return newsEntity;
	}
	
	
	/**
	 * this method convert entity to model
	 * @param newsEntity
	 * @return
	 */
	private News convertOptionalEntitytoModel(Optional<NewsEntity> newsEntity) {
		
		News news = new News();
		news.setNewsId(newsEntity.get().getNewsId());
		news.setNewsHeader(newsEntity.get().getNewsHeader());
		news.setNewsBody(newsEntity.get().getNewsBody());
		news.setNewsContact(newsEntity.get().getNewsContact());
		
		
		return news;	
	}
     private News convertEntitytoModel(NewsEntity newsEntity) {
		
		News news = new News();
		news.setNewsId(newsEntity.getNewsId());
		news.setNewsHeader(newsEntity.getNewsHeader());
		news.setNewsBody(newsEntity.getNewsBody());
		news.setNewsContact(newsEntity.getNewsContact());
		return news;
}
}

