package com.abc.healthcenter.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Payment entity class 
 * @author Pavan Pachal
 *
 * Date : 06-Jul-2021
 */
@Entity
@Table(name ="payment_tbl")
public class PaymentEntity {
	
	@Id
	@Column(name="payment_id")
	private int paymentId;
	
	@Column(name="payment_date")
	private Date paymentDate;
	
	@Column(name="payment_method")
	private String paymentMethod;
	
	@Column(name="payment_amount")
	private double paymentAmount;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private PatientEntity patient;
	

	@OneToOne
	@JoinColumn(name = "bill_id")
	private BillEntity bill;
	
	/**
	 * Getter method for Payment ID
	 * @return
	 */
	public int getPaymentId() {
		return paymentId;
	}
	
	/**
	 * Getter method for Payment ID
	 * @param paymentId
	 */
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	
	/**
	 * Getter method for Payment Date
	 * @return
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}
	
	/**
	 * Setter method for Payment Date
	 * @param paymentDate
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	/**
	 * Getter method for Payment Method
	 * @return
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}
	
	/**
	 * Setter method for Payment Method
	 * @param paymentMethod
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	/**
	 * Getter method for Payment amount
	 * @return
	 */
	public double getPaymentAmount() {
		return paymentAmount;
	}
	
	/**
	 * Setter method for Payment amount
	 * @param paymentAmount
	 */
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	

}