package com.abc.healthcenter.model;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * @author LAHARI
 *date : 05-July-2021
 */
public class Doctor {
	
	private int doctorId;

	@NotEmpty(message="please provide doctorname")
	@Positive(message = "please provide valid name")
	private String doctorName;
	
	@NotEmpty(message="please provide username")
	@Positive(message = "please provide valid UserName")
	private String doctorUserName;
	
	@NotEmpty(message="please provide password")
	@Positive(message = "please provide valid Password")
	private String doctorPassword;

	@NotEmpty(message="please provide email")
	@Email(message="email should be valid")
	private  String doctorEmail;

	@Min(value = 10, message = "please enter 10 digits")
    @Max(value = 10, message = "only 10 digits Phone number will be accepted")
	@NotNull(message="please provide contact")
	private long doctorContact;

	@NotEmpty(message="please provide gender")
	@Positive(message = "please provide valid ")
	private String doctorGender;

	@NotNull(message="please provide experience")
	@Positive(message = "please provide valid Experience")
	private int doctorExperience;

	@NotEmpty(message="please provide department")
	@Positive(message = "please provide valid Department")
	private String doctorDepartment;

	@NotEmpty(message="please provide qualification")
	@Positive(message = "please provide valid Qualification")
	private String doctorQualification;
	
	@NotEmpty(message="please provide address")
	@Positive(message = "please provide valid Address")
	private String doctorAddress;

	/**
	 * getter for doctorId
	 * @return doctorId
	 */
	public int getDoctorId() {
		return doctorId;
	}

	/**
	 * setter for doctorId
	 * @param doctorID
	 */
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	/**
	 * getter for DoctorName
	 * @return doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	
	/**
	 * setter for doctorName
	 * @param doctorName
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	/**
	 * getter for DoctorUserName
	 * @return DoctorUserName
	 */
	public String getDoctorUserName() {
		return doctorUserName;
	}

	/**
	 * setter for DoctorUserName
	 * @param doctorUserName
	 */
	public void setDoctorUserName(String doctorUserName) {
		this.doctorUserName = doctorUserName;
	}

	/**
	 * getter for DoctorPassword
	 * @return DoctorPassword
	 */
	public String getDoctorPassword() {
		return doctorPassword;
	}

	/**
	 * setter for doctorPassword
	 * @param doctorPassword
	 */
	public void setDoctorPassword(String doctorPassword) {
		this.doctorPassword = doctorPassword;
	}

	/**
	 * getter for doctorEmail
	 * @return doctorEmail
	 */
	public String getDoctorEmail() {
		return doctorEmail;
	}

	/**
	 * setter for doctorEmail
	 * @param doctorEmail
	 */
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	/**
	 * getter for doctorContact
	 * @return doctorContact
	 */
	public long getDoctorContact() {
		return doctorContact;
	}

	/**
	 * setter for doctorContact
	 * @param doctorContact
	 */
	public void setDoctorContact(long doctorContact) {
		this.doctorContact = doctorContact;
	}

	/**
	 * getter for DoctorGender
	 * @return doctorGender
	 */
	public String getDoctorGender() {
		return doctorGender;
	}

	/**
	 * setter for DoctorGender
	 * @param doctorGender
	 */
	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}
	
	/**
	 * getter for DoctorExperience in years
	 * @return DoctorExperience in years
	 */
	public int getDoctorExperience() {
		return doctorExperience;
	}

	/**
	 * setter for doctorExperience in years
	 *
	 * @param doctorExperience
	 */
	public void setDoctorExperience(int doctorExperience) {
		this.doctorExperience = doctorExperience;
	}

	/**
	 * getter for DoctorDepartment
	 * @return doctorDepartment
	 */
	public String getDoctorDepartment() {
		return doctorDepartment;
	}

	/**
	 * setter for doctorDepartment
	 * @param doctorDepartment
	 */
	public void setDoctorDepartment(String doctorDepartment) {
		this.doctorDepartment = doctorDepartment;
	}

	/**
	 * getter for doctorQualification
	 * @return doctorQualification
	 */
	public String getDoctorQualification() {
		return doctorQualification;
	}

	/**
	 * setter for doctorQualification
	 * @param doctorQualification
	 */
	public void setDoctorQualification(String doctorQualification) {
		this.doctorQualification = doctorQualification;
	}

	/**
	 * getter for DoctorAddress
	 * @return doctorAddress
	 */
	public String getDoctorAddress() {
		return doctorAddress;
	}

	/**
	 * setter for doctorAddress
	 * @param doctortAddress
	 */
	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}
	
}