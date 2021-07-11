package com.abc.healthcenter.repository;


import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abc.healthcenter.entity.NewsEntity;
	

	/**
	 * @author venkatesh
	 *
	 *Date : 06-Jul-2021
	 */
	public interface NewsRepository extends JpaRepository<NewsEntity , Integer> {

		public Optional<NewsEntity> findByNewsHeader(String NewsHeader);
		
		public Optional<NewsEntity> findByNewsDate(LocalDate NewsDate);
}
