package com.abc.healthcenter.model;

import javax.validation.constraints.NotEmpty;

/**
 * @author venkatesh
 *
 *Date : 07-Jul-2021
 */
public class AdminLogin {
	
	@NotEmpty(message="please provide username")
	private String adminUserName;
	
	@NotEmpty(message="please provide password")
	private String adminPassword;
	

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