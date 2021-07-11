package com.abc.healthcenter.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author venkatesh
 *
 *Date : 05-Jul-2021
 */
public class Admin {
	
	@NotNull(message="please provide adminId")
	private int adminId;
	
	@NotEmpty(message="please provide adminName")
	private String adminName;
	
	@NotEmpty(message="please provide username")
	private String adminUserName;
	
	@NotEmpty(message="please provide email")
	private String adminEmail;
	
	@NotEmpty(message="please provide password")
	private String adminPassword;

	/**
	 * getter for admin id
	 * @return
	 */
	public int getAdminId() {
		return adminId;
	}

	/**
	 * setter for admin  id
	 * @param adminId
	 */
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	/**
	 * getter for admin name
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
	public String getAdminpassword() {
		return adminPassword;
	}

	/**
	 * setter for admin password
	 * @param adminpassword
	 */
	public void setAdminpassword(String adminpassword) {
		this.adminPassword = adminpassword;
	}
}

