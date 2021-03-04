package uni.pu.fmi.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import uni.pu.fmi.services.ReservationService;

public class ReservationScreenModel {

	private String country;
	private String city;
	private String location;
	private Date pickUpDate;
	private Date dropOffDate;
	private String carModel;
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private boolean driver;
	private boolean agreement;
	private String message;

	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

	public void navigateToMe() {
		System.out.println("Екранът за резервация е отворен!");

	}

	public void setCountry(String country) {
		this.country = country;

	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setLocation(String location) {
		this.location = location;

	}

	public void setPickUpDate(String fromDate) throws ParseException {
		pickUpDate = df.parse(fromDate);
	}

	public void setDropOffDate(String toDate) throws ParseException {
		dropOffDate = df.parse(toDate);

	}

	public void setCar(String car) {
		this.carModel = car;

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	public void setLastName(String lastName) {
		this.lastName = lastName;

	}

	public void setEmail(String email) {
		this.email = email;

	}

	public String getEmail() {
		return email;
	}

	public void setAge(String age) {
		this.age = Integer.parseInt(age);

	}
	
	public void setDriver(String driver) {
		this.driver = Boolean.parseBoolean(driver);
	}
	
	public void setAgreement(String agreement) {
		this.agreement = Boolean.parseBoolean(agreement);
	}

	public void clickReservationButton() throws ParseException {
		message = ReservationService.reservation(pickUpDate, dropOffDate, carModel, age, driver, agreement);
	}

	public String getReservationMessage() {
		return message;
	}

}
