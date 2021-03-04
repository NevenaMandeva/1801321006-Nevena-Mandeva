package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class Car {

	private String carId;
	private String model;
	private String fuelType;
	private String transmission;
	private int seats;
	private String description;
	private double rentalPrice;
	public Set<Reservation> reservations;
	public Office office;

	/**
	 * @return
	 */

	/**
	 * Default constructor
	 */
	public Car() {
	}

	public String getModel() {
		return model;
	}

	/**
	 * @param model
	 * @return
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return
	 */
	public String getFuelType() {
		return fuelType;
	}

	/**
	 * @param fuelType
	 * @return
	 */
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	/**
	 * @return
	 */
	public String getTransmission() {
		return transmission;
	}

	/**
	 * @param transmission
	 * @return
	 */
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	/**
	 * @return
	 */
	public int getSeats() {
		return seats;
	}

	/**
	 * @param seats
	 * @return
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}

	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 * @return
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return
	 */
	public Double getRentalPrice() {
		return rentalPrice;
	}

	/**
	 * @param rentalPrice
	 * @return
	 */
	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	/**
	 * @return the carId
	 */
	public String getCarId() {
		return carId;
	}

}