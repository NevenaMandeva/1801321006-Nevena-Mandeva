package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class Reservation {

	private String reservationId;
	private String pickUpLocation;
	private String dropOffLocation;
	private Date pickUpDate;
	private Date dropOffDate;
	public String carModel;
	public Customer customer;
	public Payment payment;
	public Office office;
	public Driver driver;

	/**
	 * Default constructor
	 */
	public Reservation() {
	}

	/**
	 * @return the pickUpLocation
	 */
	public String getPickUpLocation() {
		return pickUpLocation;
	}

	/**
	 * @param pickUpLocation the pickUpLocation to set
	 */
	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}

	/**
	 * @return the dropOffLocation
	 */
	public String getDropOffLocation() {
		return dropOffLocation;
	}

	/**
	 * @param dropOffLocation the dropOffLocation to set
	 */
	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}

	/**
	 * @return the pickUpDate
	 */
	public Date getPickUpDate() {
		return pickUpDate;
	}

	/**
	 * @param pickUpDate the pickUpDate to set
	 */
	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	/**
	 * @return the dropOffDate
	 */
	public Date getDropOffDate() {
		return dropOffDate;
	}

	/**
	 * @param dropOffDate the dropOffDate to set
	 */
	public void setDropOffDate(Date dropOffDate) {
		this.dropOffDate = dropOffDate;
	}

	/**
	 * @return
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 * @return
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return
	 */
	public Office getOffice() {
		return office;
	}

	/**
	 * @param office
	 * @return
	 */
	public void setOffice(Office office) {
		this.office = office;
	}

	/**
	 * @return
	 */
	public Payment getPayment() {
		return payment;
	}

	/**
	 * @param payment
	 * @return
	 */
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	/**
	 * @return
	 */
	public String getCarModel() {
		return carModel;
	}

	/**
	 * @param car
	 * @return
	 */
	public void setCarModel(String car) {
		this.carModel = car;
	}

	/**
	 * @return
	 */
	public Driver getDriver() {
		return driver;
	}

	/**
	 * @param driver
	 * @return
	 */
	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	/**
	 * @return the reservationId
	 */
	public String getReservationId() {
		return reservationId;
	}
}