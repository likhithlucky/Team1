package com.abc.healthcenter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 * 
 * @author venkatesh
 *
 *Date : 05-Jul-2021
 */
@Entity
@Table(name = "admin_tbl")

public class AdminEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="admin_id")
	private int adminId;
	
	@Column(name="admin_name")
	private String adminName;
	
	@Column(name="admin_username")
	private String adminUserName;
	
	@Column(name="admin_email")
	private String adminEmail;
	
	@Column(name="admin_password")
	private String adminPassword;

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

	/**getter for admin name
	 * 
	 * @return
	 */
	public String getAdminName() {
		return adminName;
	}
	
	/**
	 * setter for admin name
	 * @param adminName
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * getter for admin user name
	 * @return
	 */
	public String getAdminUserName() {
		return adminUserName;
	}
	
	/**
	 * setter for admin user name
	 * @param adminUserName
	 */
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	/**
	 * getter for admin email
	 * @return
	 */
	public String getAdminEmail() {
		return adminEmail;
	}

	/**
	 * setter for admin email
	 * @param adminEmail
	 */
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	/**
	 * getter for admin password
	 * @return
	 */
	public String getAdminPassword() {
		return adminPassword;
	}

	/**
	 * setter for admin password
	 * @param adminPassword
	 */
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
}
	