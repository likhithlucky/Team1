package com.abc.healthcenter.model;


import java.time.LocalDate;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	@Size(min=3,max=1500,message="news body must be between 10 to 1500 only")
	private String newsBody;
	
	@NotEmpty(message="please provide newsContact")
	private String newsContact;
	

	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	@PastOrPresent(message="please provide date")
	private LocalDate newsDate;
    
	
	private int adminId;
	
	
    /**
     * getter fro newsId
     * @return
     */
	public int getNewsId() {
		return newsId;
	}
    /**
     * setter for newsId
     * @param newsId
     */
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
    /**
     * getter for adminId
     * @return
     */
	public int getAdminId() {
		return adminId;
	}
    /**
     * setter for adminId
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
	 * getter for newsdate
	 * @return
	 */
	public LocalDate getNewsDate() {
		return newsDate;
	}
	/**
	 * setter for newsdate
	 * @param newsDate
	 */
	public void setNewsDate(LocalDate newsDate) {
		this.newsDate = newsDate;
	}

	

}
