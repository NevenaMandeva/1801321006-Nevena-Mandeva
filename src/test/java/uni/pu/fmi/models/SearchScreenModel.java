package uni.pu.fmi.models;

import uni.pu.fmi.services.SearchService;

public class SearchScreenModel {

	private String country;
	private String city;
	private String location;
	private String message;

	public void navigateToMe() {
		System.out.println("Екранът за търсене е отворен");
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

	public void clickSearchButton() {
		message = SearchService.search(country, city, location);
	}

	public String getSearchMessage() {
		return message;
	}

}
