package com.abc.healthcenter.model;

<<<<<<< HEAD
public class Admin {
	
	private int adminId;
	
	private String userName;
	
	private String password;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
=======
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
	
	@NotEmpty(message="please priovide username")
	private String userName;
	
	@NotEmpty(message="please priovide password")
	private String password;
    
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
	 * getter for userName
	 * @return
	 */
	public String getUserName() {
		return userName;
	}
    
	/**
	 * setter for userName
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
    /**
     * getter for password
     * @return
     */
	public String getPassword() {
		return password;
	}
    /**
     * setter for password
     * @param password
     */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
>>>>>>> branch 'master' of https://github.com/likhithlucky/Team1.git
