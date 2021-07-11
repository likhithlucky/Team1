package com.abc.healthcenter.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


/**
 * @author venkatesh
 *
 *date :08-Jul-2021
 */
public class AdminForgetPassword {
	
	@NotEmpty(message="please provide username")
	private String adminUserName;
	
	@NotEmpty(message="please provide email")
	@Email(message="email should be valid")
	private String adminEmail;
	
	@NotEmpty(message="please provide password")
	private String newPassword;
	
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
	 * getter for new password
	 * @return
	 */
	public String getNewPassword() {
		return newPassword;
	}
	/**
	 * setter for new password
	 * @param newPassword
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	

}
