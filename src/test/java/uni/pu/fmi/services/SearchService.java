package uni.pu.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.Office;

public class SearchService {

	public static String search(String country, String city, String location) {
		List<Office> offices = getOffices();

		if (null == country || country.isBlank()) {
			return "Моля изберете държава";
		}

		if (null == city || city.isBlank()) {
			return "Моля изберете град";
		}

		if (null == location || location.isBlank()) {
			return "Моля изберете локация";
		}

		boolean isCountryAvailable = false;
		boolean isCityAvailable = false;

		for (Office office : offices) {

			if (office.getCountry().equals(country)) {
				isCountryAvailable = true;
				if(office.getAddress().equals(city))
				isCityAvailable = true;
			}
		}

		if (isCountryAvailable && isCityAvailable) {
			return "Има открити резултати";
		} else if (isCountryAvailable) {
			return "Няма открити резултати за посочения град";
		} else {
			return "Няма открити резултати за посочената държава";
		}
	}

	public static List<Office> getOffices() {
		ArrayList<Office> offices = new ArrayList<>();
		Office office = new Office();
		office.setCountry("Финландия");
		office.setAddress("Тампере");
		offices.add(office);
		return offices;
	}
}
