/**
 * 
 */
package com.abc.healthcenter.service;

import com.abc.healthcenter.exception.ResourceAlreadyExistException;
import com.abc.healthcenter.exception.ResourceNotAvailableException;
import com.abc.healthcenter.exception.ResourceNotFoundException;
import com.abc.healthcenter.exception.UnauthorisedAttemptException;
import com.abc.healthcenter.model.AppointmentFeedback;

/**
 * @author NAGA SRI HARSHA
 * date : 10-July-2021
 */
public interface AppointmentFeedbackService {
	
	/**
	 * method to save feedback for an appointment
	 * @param feedback
	 * @return saved AppointmentFeedback
	 * @throws UnauthorisedAttemptException
	 * @throws ResourceNotFoundException
	 * @throws ResourceAlreadyExistException
	 */
	public AppointmentFeedback saveFeedback(AppointmentFeedback feedback) throws UnauthorisedAttemptException,ResourceNotFoundException,ResourceAlreadyExistException;
	
	/**
	 * method to view feedback of an appointment
	 * @param appointmentId
	 * @return appointment feedback with the given appointmentId
	 * @throws ResourceNotFoundException
	 * @throws ResourceNotAvailableException
	 */
	public AppointmentFeedback viewFeedback(int appointmentId) throws ResourceNotFoundException,ResourceNotAvailableException;
}