package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class Payment {

	private String paymentId;
	private String method;
	private double amount;
	public Reservation reservation;
	public Customer customer;

	/**
	 * Default constructor
	 */
	public Payment() {
	}

	/**
	 * @return
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * @param method
	 * @return
	 */
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * @return
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 * @return
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the paymentId
	 */
	public String getPaymentId() {
		return paymentId;
	}

}