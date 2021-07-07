package com.abc.healthcenter.model;

<<<<<<< HEAD
import java.time.LocalDate;


public class News {
	private String newsHeader;
	
	private String newsBody;
	
	private String newsContact;
	
	private LocalDate newsDate;

	private int adminId;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getNewsHeader() {
		return newsHeader;
	}

	public void setNewsHeader(String newsHeader) {
		this.newsHeader = newsHeader;
	}

	public String getNewsBody() {
		return newsBody;
	}

	public void setNewsBody(String newsBody) {
		this.newsBody = newsBody;
	}

	public String getNewsContact() {
		return newsContact;
	}

	public void setNewsContact(String newsContact) {
		this.newsContact = newsContact;
	}

	public LocalDate getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(LocalDate newsDate) {
		this.newsDate = newsDate;
	}

}
=======
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author venkatesh
 *
 *Date : 05-Jul-2021
 */
public class News {
	
	@NotNull(message = "please provide newsId")
	private int newsId;
	
	@NotEmpty(message = "please provide news Header") 
	private String newsHeader;
	
	@NotEmpty(message="please provide news Body")
	private String newsBody;
	
	@NotEmpty(message="please provide newsContact")
	private String newsContact;
	
	@NotEmpty(message="please provide date")
	private String newsDate;

	private int adminId;
	
	
    /**
     * getter fro news id
     * @return
     */
	public int getNewsId() {
		return newsId;
	}
    /**
     * setter for news id
     * @param newsId
     */
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
    /**
     * getter for admin id
     * @return
     */
	public int getAdminId() {
		return adminId;
	}
    /**
     * setter for admin id
     * @param adminId
     */
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
    
	/**
	 * getter for newsHeader
	 * @return
	 */
	public String getNewsHeader() {
		return newsHeader;
	}
    
	/**
	 * setter for newsHeader
	 * @param newsHeader
	 */
	public void setNewsHeader(String newsHeader) {
		this.newsHeader = newsHeader;
	}
    
	/**
	 * getter for newsBody
	 * @return
	 */
	public String getNewsBody() {
		return newsBody;
	}
    
	/**
	 * setter for newsBody
	 * @param newsBody
	 */
	public void setNewsBody(String newsBody) {
		this.newsBody = newsBody;
	}
    
	/**
	 * getter for newsContact
	 * @return
	 */
	public String getNewsContact() {
		return newsContact;
	}
	
    /**
     * setter fro newsContact
     * @param newsContact
     */
	public void setNewsContact(String newsContact) {
		this.newsContact = newsContact;
	}

	/**
	 * getter for NewsDate
	 * @return
	 */
	public String getNewsDate() {
		return newsDate;
	}

	/**
	 * setter fro newsDate
	 * @param newsDate
	 */
	public void setNewsDate(String newsDate) {
		this.newsDate = newsDate;
	}

}
>>>>>>> branch 'master' of https://github.com/likhithlucky/Team1.git
