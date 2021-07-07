package com.abc.healthcenter.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.healthcenter.entity.DoctorEntity;
import com.abc.healthcenter.exception.InvalidCredentialsException;
import com.abc.healthcenter.exception.ResourceAlreadyExistException;
import com.abc.healthcenter.exception.ResourceNotFoundException;
import com.abc.healthcenter.model.Doctor;
import com.abc.healthcenter.model.DoctorLogin;
import com.abc.healthcenter.repository.DoctorRepository;

/**
 * 
 * @author NAGA SRI HARSHA
 *date : 05-July-2021
 */
@Service
public class DoctorServiceImp implements DoctorService{
	
	@Autowired
	private DoctorRepository doctorRepository;
	private static final Logger LOGGER = LoggerFactory.getLogger(DoctorServiceImp.class);
	
	/**
	 * implements saveDoctor from DoctorService interface
	 * {@inheritDoc}
	 */
	@Override
	public void saveDoctor(Doctor doctor) throws ResourceAlreadyExistException {
		LOGGER.info("doctorRepository::findById(int id)method called");
		Optional<DoctorEntity> doctorEntity1 = doctorRepository.findById(doctor.getDoctorID());
		LOGGER.info("Optional<Doctor> object saved");
		if(doctorEntity1.isPresent()) {
			LOGGER.error("ResourceAlreadyExistException encountered with id"+doctor.getDoctorID());
			throw new ResourceAlreadyExistException("Doctor already exists with this ID"+doctor.getDoctorID());
		}
		else {
			DoctorEntity doctorEntity = convertModeltoEntity(doctor);
			doctorRepository.save(doctorEntity);
			LOGGER.info("doctor details saved in repository");
			
		}
		LOGGER.info("Exiting from DoctorServiceImp::saveDoctor(Doctor doctor)method");
	}
	
	/**
	 * implements findDoctorbyId from DoctorService Interface
	 * {@inheritDoc}
	 */
	@Override
	 public Doctor findDoctorbyId(int id) throws ResourceNotFoundException{

		LOGGER.info("doctorRepository::findById method called from DoctorService::findDoctorbyId");
		Optional<DoctorEntity> doctorEntity = doctorRepository.findById(id);
		if(doctorEntity.isPresent()) {
			Doctor doctor = convertEntitytoModel(doctorEntity);
			
			LOGGER.info("returned doctor object to DoctorController::findDoctor(int id)method");
			return doctor;
		}
		else {
			LOGGER.error("ResourceNotFoundException encountered with ID "+id);
			throw new ResourceNotFoundException("Cannot find doctor with this ID"+id);
		}
	}
	
	/**
	 * implements deleteDoctorbyId from DoctorService interface
	 * {@inheritDoc}
	 */
	@Override
	public void deleteDoctorbyId(int id)throws ResourceNotFoundException{
		LOGGER.info("FindById method called from DoctorServiceImp::deleteDoctorbyId method");
		Optional<DoctorEntity> doctorEntity = doctorRepository.findById(id);
		if(doctorEntity.isPresent()) {
			doctorRepository.deleteById(id);
			LOGGER.info("DELETED the given Doctor Details");
		}
		else {
			LOGGER.error("ResourceNotFoundException encountered with id "+id);
			throw new ResourceNotFoundException("Cannot find doctor with this ID "+id);
		}
		LOGGER.info("Exiting from DoctorServiceImp::deleteDoctorbyId(int id)method");
	}
	
	/**
	 * implements findDoctorbyName from DoctorService interface
	 * {@inheritDoc}
	 */
	@Override
	public Doctor findDoctorbyName(String name) throws ResourceNotFoundException{
		LOGGER.info("FindByName method called from DoctorServiceImp::findDoctorbyName method");
		Optional<DoctorEntity> doctorEntity = doctorRepository.findByDoctorName(name);
		if(doctorEntity.isPresent()) {
			Doctor doctor = convertEntitytoModel(doctorEntity);
			LOGGER.info("Requested Doctor is created and returned");
			return doctor;
		}
		else {
			LOGGER.info("ResourceNotFoundException encountered with name "+name);
			throw new ResourceNotFoundException("Cannot find doctor with this Name"+name);
		}

	}
	
	/**
	 * implements updateDoctorbyId from DoctorService interface
	 * {@inheritDoc}
	 */
	@Override
	public void updateDoctorbyId(Doctor doctor) throws ResourceNotFoundException {
		
		LOGGER.info("FindById method called from DoctorServiceImp::updateDoctorbyId method");
		DoctorEntity doctorEntity = doctorRepository.findById(doctor.getDoctorID()).get();
		if(doctorEntity == null){
			LOGGER.error("ResourceNotFoundException encountered with id "+doctor.getDoctorID());
			throw new ResourceNotFoundException("Cannot find doctor with this Id"+doctor.getDoctorID());
		}
		else
		{
			doctorEntity.setDoctorID(doctor.getDoctorID());
			doctorEntity.setDoctorName(doctor.getDoctorName());
			doctorEntity.setDoctorContact(doctor.getDoctorContact());
			doctorEntity.setDoctorDepartment(doctor.getDoctorDepartment());
			doctorEntity.setDoctorEmail(doctor.getDoctorEmail());
			doctorEntity.setDoctorExperience(doctor.getDoctorExperience());
			doctorEntity.setDoctorGender(doctor.getDoctorGender());
			doctorEntity.setDoctorQualification(doctor.getDoctorQualification());
			doctorEntity.setDoctorAddress(doctor.getDoctorAddress());
			doctorEntity.setDoctorUserName(doctor.getDoctorUserName());
			doctorEntity.setDoctorPassword(doctor.getDoctorPassword());
			doctorRepository.save(doctorEntity);
			LOGGER.info("Doctor Details are updated");
		}
		LOGGER.info("Exiting from DoctorServiceImp::updateDoctorbyId(Doctor doctor)method ");
	}
	/**
	 * implements checkDoctorCredentials from DoctorServiceInterface
	 * {@inheritDoc}
	 */
	@Override
	public boolean checkDoctorCredentials(DoctorLogin doctorlogin) throws InvalidCredentialsException {
		Optional<DoctorEntity> doctor = doctorRepository.findByDoctorUserName(doctorlogin.getDoctorUserName());
		
		if(doctor.isEmpty()) {
			
			throw new InvalidCredentialsException("No data found with that username");
		}
		else {
			if(doctorlogin.getDoctorPassword() == doctor.get().getDoctorPassword()) {
				boolean check = true;
				return check;
			}
			else {
				throw new InvalidCredentialsException("Please enter correct password");
			}
		}
	}
	
	/**
	 * converts Doctor into doctorEntity
	 * @param doctor
	 * @return doctorEntity
	 */
	private DoctorEntity convertModeltoEntity(Doctor doctor) {
		DoctorEntity doctorEntity = new DoctorEntity();
		doctorEntity.setDoctorID(doctor.getDoctorID());
		doctorEntity.setDoctorName(doctor.getDoctorName());
		doctorEntity.setDoctorContact(doctor.getDoctorContact());
		doctorEntity.setDoctorDepartment(doctor.getDoctorDepartment());
		doctorEntity.setDoctorEmail(doctor.getDoctorEmail());
		doctorEntity.setDoctorExperience(doctor.getDoctorExperience());
		doctorEntity.setDoctorGender(doctor.getDoctorGender());
		doctorEntity.setDoctorQualification(doctor.getDoctorQualification());
		doctorEntity.setDoctorAddress(doctor.getDoctorAddress());
		doctorEntity.setDoctorUserName(doctor.getDoctorUserName());
		doctorEntity.setDoctorPassword(doctor.getDoctorPassword());
		return doctorEntity;
	}
	
	/**
	 * converts doctorEntity into model
	 * @param doctorEntity
	 * @return
	 */
	private Doctor convertEntitytoModel(Optional<DoctorEntity> doctorEntity) {
		Doctor doctor = new Doctor();
		doctor.setDoctorID(doctorEntity.get().getDoctorID());
		doctor.setDoctorName(doctorEntity.get().getDoctorName());
		doctor.setDoctorEmail(doctorEntity.get().getDoctorEmail());
		doctor.setDoctorContact(doctorEntity.get().getDoctorContact());
		doctor.setDoctorDepartment(doctorEntity.get().getDoctorDepartment());
		doctor.setDoctorExperience(doctorEntity.get().getDoctorExperience());
		doctor.setDoctorGender(doctorEntity.get().getDoctorGender());
		doctor.setDoctorQualification(doctorEntity.get().getDoctorQualification());
		doctor.setDoctorAddress(doctorEntity.get().getDoctorAddress());
		doctor.setDoctorUserName(doctorEntity.get().getDoctorUserName());
		doctor.setDoctorPassword(doctorEntity.get().getDoctorPassword());
		return doctor;
	}
}
	
