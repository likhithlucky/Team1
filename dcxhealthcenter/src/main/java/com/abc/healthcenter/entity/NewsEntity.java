package com.abc.healthcenter.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * 
 * @author venkatesh
 *
 *Date : 05-Jul-2021
 */
@Entity
@Table(name = "news_tbl")
public class NewsEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="newsId")
	private int newsId;
	
	@Column(name="header")
	private String newsHeader;
	
	@Column(name="body")
	@Size(min = 3, max = 1500)
	private String newsBody;
	
	@Column(name="contact")
	private String newsContact;
	
	@Column(name="adminId")
	private int adminId;
    
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
	 * getter for newsId
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
     * getter for news header
     * @return
     */
	public String getNewsHeader() {
		return newsHeader;
	}
    /**
     * setter for news header
     * @param newsHeader
     */
	public void setNewsHeader(String newsHeader) {
		this.newsHeader = newsHeader;
	}
    /**
     * getter for news body
     * @return
     */
	public String getNewsBody() {
		return newsBody;
	}
    /**
     * setter for news body
     * @param newsBody
     */
	public void setNewsBody(String newsBody) {
		this.newsBody = newsBody;
	}
    /**
     * getter for news contact
     * @return
     */
	public String getNewsContact() {
		return newsContact;
	}
    /**
     * setter for news contact
     * @param newsContact
     */
	public void setNewsContact(String newsContact) {
		this.newsContact = newsContact;
	}
   
}