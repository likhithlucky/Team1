package com.abc.healthcenter.service;
import com.abc.healthcenter.exception.InvalidCredentialsException;
import com.abc.healthcenter.exception.ResourceAlreadyExistException;
import com.abc.healthcenter.exception.ResourceNotFoundException;
import com.abc.healthcenter.model.Doctor;
import com.abc.healthcenter.model.DoctorForgetPassword;
import com.abc.healthcenter.model.DoctorLogin;


/**
 * 
 * @author NAGA SRI HARSHA
 *date : 05-July-2021
 */
public interface DoctorService {
 /**
  * 
  * @param doctor
  * @throws ResourceAlreadyExistException
  */
 public Doctor saveDoctor(Doctor doctor) throws ResourceAlreadyExistException;
 /**
  * 
  * @param DoctorId
  * @return required Doctor Details
  * @throws ResourceNotFoundException
  */
 public Doctor findDoctorbyId(int id) throws ResourceNotFoundException;
 /**
  * 
  * @param DoctorId
  * @throws ResourceNotFoundException
  */
 public void deleteDoctorbyId(int id)throws ResourceNotFoundException;
 /**
  * 
  * @param name
  * @return Required Doctor Details
  * @throws ResourceNotFoundException
  */
 public Doctor findDoctorbyName(String name) throws ResourceNotFoundException;
 /**
  * 
  * @param doctor
  * @throws ResourceNotFoundException
  */
 public void updateDoctorbyId(Doctor doctor) throws ResourceNotFoundException;
 /**
  * 
  * @param doctorlogin
  * @return the status of login as success or failure
  * @throws InvalidCredentialsException
  */
 public boolean checkDoctorCredentials(DoctorLogin doctorlogin) throws InvalidCredentialsException;
 
 /**
  * 
  * @param doctorcredentials
  * @throws InvalidCredentialsException
  */
 public void forgetPasword(DoctorForgetPassword doctorcredentials) throws InvalidCredentialsException;
}
