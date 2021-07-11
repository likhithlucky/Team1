package com.abc.healthcenter.exception;
/**
 * 
 * @author LIKHITH  A S
 *  Jul 11, 2021
 */
public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	/**
	 * Constructor for Exception Message
	 * @param msg
	 */
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}