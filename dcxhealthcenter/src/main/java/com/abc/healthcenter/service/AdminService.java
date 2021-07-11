package com.abc.healthcenter.service;


import com.abc.healthcenter.exception.InvalidCredentialsException;
import com.abc.healthcenter.exception.ResourceAlreadyExistException;
import com.abc.healthcenter.exception.ResourceNotFoundException;
import com.abc.healthcenter.model.Admin;
import com.abc.healthcenter.model.AdminForgetPassword;
import com.abc.healthcenter.model.AdminLogin;


/**
 * 
 * @author venkatesh
 *
 *Date : 05-Jul-2021
 */

public interface AdminService {
	
	/**
	 * Saving the Admin details
	 * @param admin
	 * @throws ResourceAlreadyExistException
	 */
	
	public void saveAdmin(Admin admin) throws ResourceAlreadyExistException;
	
	/**
	 * 
	 * deleting the Admin details
	 * @param id
	 * @throws ResourceNotFoundException
	 */
	
	public void deleteAdminbyId(int id) throws ResourceNotFoundException;
	
	/**
	 * updating the Admin details
	 * @param admin
	 * @throws ResourceNotFoundException
	 */
	
	public void updateAdminbyId(Admin admin) throws ResourceNotFoundException;
	
    /**
     * finding the Admin by id
     * @param id
     * @return
     * @throws ResourceNotFoundException
     */
	public Admin findAdminbyId(int id) throws ResourceNotFoundException;
	
	/**
	 * checking admin credentials
	 * @param adminlogin
	 * @return
	 * @throws InvalidCredentialsException
	 */
	 public boolean checkAdminCredentials(AdminLogin adminlogin) throws InvalidCredentialsException;
	 
	 /**
	  * reseting the admin password
	  * @param admincredentials
	  * @throws InvalidCredentialsException
	  */
	 public void forgetAdminPassword(AdminForgetPassword admincredentials) throws InvalidCredentialsException;
}