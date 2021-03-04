package uni.pu.fmi.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import uni.pu.fmi.Reservation;

public class ReservationService {

	static DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

	public static String reservation(Date pickUpDate, Date dropOffDate, String carModel, int age, boolean driver, boolean agreement)
			throws ParseException {
		if (18 > age) {
			return "Трябва да имате навършени 18 години, за резервация!";
		}
		if(driver) {
			return "Успешна резервация с шофьор!";
		}
		if (!agreement) {
			return "Моля посочете, че сте информирани и съгласни с нашите правила и условия!";
		}
		List<Reservation> reservations = getReservationsByCarModel(carModel);
		boolean isCarAvailable = false;
		if (reservations.isEmpty()) {
			isCarAvailable = true;
		} else {
			for (Reservation reservation : reservations) {
				Date pickDate = reservation.getDropOffDate();
				Date dropDate = reservation.getDropOffDate();
				if ((pickUpDate.before(pickDate) && dropOffDate.before(dropDate))
						|| (pickUpDate.after(pickDate) && dropOffDate.after(dropDate))) {
					isCarAvailable = true;
				} else {
					isCarAvailable = false;
				}
			}
		}
		return isCarAvailable ? "Успешна резервация!" : "Колата, която се опитвате да резервирате е заета за посочената дата!";
	}

	public static List<Reservation> getReservationsByCarModel(String carModel) throws ParseException {
		List<Reservation> reservationsByCar = new ArrayList<>();
		List<Reservation> reservations = getReservations();
		for (Reservation reservation : reservations) {
			if (carModel.equals(reservation.getCarModel())) {
				reservationsByCar.add(reservation);
			}
		}
		return reservations;
	}

	public static List<Reservation> getReservations() throws ParseException {
		Reservation reservation1 = new Reservation();
		Reservation reservation2 = new Reservation();

		reservation1.setPickUpDate(df.parse("26-02-2021"));
		reservation1.setDropOffDate(df.parse("28-02-2021"));
		reservation1.setCarModel("Opel Astra Sedan");

		reservation2.setPickUpDate(df.parse("01-03-2021"));
		reservation2.setDropOffDate(df.parse("10-03-2021"));
		reservation2.setCarModel("Opel Astra Sedan");

		List<Reservation> reservations = new ArrayList<>();

		reservations.add(reservation1);
		reservations.add(reservation2);
		return reservations;
	}
}
