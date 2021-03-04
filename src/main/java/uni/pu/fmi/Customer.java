package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class Customer {

	private String customerId;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String phoneNumber;
	private String comment;
	public Set<Reservation> reservations;
	public Set<Payment> payment;

	/**
	 * Default constructor
	 */
	public Customer() {
	}

	/**
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 * @return
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 * @return
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 * @return
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 * @return
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 * @return
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

}