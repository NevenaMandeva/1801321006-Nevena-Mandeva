package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.ReservationScreenModel;

public class ReservationSteps {

	ReservationScreenModel reservationScreen = new ReservationScreenModel();

	@Given("^Клиентът отваря страницата за резервация$")
	public void openReservationScreen() throws Throwable {
		reservationScreen.navigateToMe();
	}

	@When("^Клиентът избира държава от падащия лист \"([^\"]*)\"$")
	public void selectCountry(final String country) throws Throwable {
		reservationScreen.setCountry(country);
	}

	@When("^Селектира град от активния лист за избраната в предна стъпка държава \"([^\"]*)\"$")
	public void selectCity(final String city) throws Throwable {
		reservationScreen.setCity(city);
	}

	@When("^Селектира локация за получаване на колата от активен лист за избрания в предна стъпка град \"([^\"]*)\"$")
	public void selectLocation(final String location) throws Throwable {
		reservationScreen.setLocation(location);
	}

	@When("^Избира дата на получаване \"([^\"]*)\"$")
	public void selectPickUpDate(final String pickUpDate) throws Throwable {
		reservationScreen.setPickUpDate(pickUpDate);
	}

	@When("^Избира дата на връщане \"([^\"]*)\"$")
	public void selectDropOffDate(final String dropOffDate) throws Throwable {
		reservationScreen.setDropOffDate(dropOffDate);
	}

	@When("^Избира кола от генерирания лист, свободни коли за съответния период \"([^\"]*)\"$")
	public void selectCar(final String carModel) throws Throwable {
		reservationScreen.setCar(carModel);
	}

	@When("^Клиентът въвежда своето име \"([^\"]*)\"$")
	public void addFirstName(final String firstName) throws Throwable {
		reservationScreen.setFirstName(firstName);
	}

	@When("^Клиентът въвежда своята фамилия \"([^\"]*)\"$")
	public void addLastName(final String lastName) throws Throwable {
		reservationScreen.setLastName(lastName);
	}

	@When("^Клиентът въвежда имейл \"([^\"]*)\"$")
	public void addEmail(final String email) throws Throwable {
		reservationScreen.setEmail(email);
	}

	@When("^Клиентът въвежда имейл отново за потвърждение \"([^\"]*)\"$")
	public void confirmEmail(final String email) throws Throwable {
		assertEquals(email, reservationScreen.getEmail());
	}

	@When("^Клиентът въвежда възраст \"([^\"]*)\"$")
	public void addAge(final String age) throws Throwable {
		reservationScreen.setAge(age);
	}

	@When("^Клиентът избира да наеме и личен шофьор \"([^\"]*)\"$")
	public void requestDriver(String driver) throws Throwable {
	    reservationScreen.setDriver(driver);
	}
	
	@When("^Клиентът се съгласява с правилата и условията \"([^\"]*)\"$")
	public void confirmAgreement(final String agreement) throws Throwable {
		reservationScreen.setAgreement(agreement);
	}

	@When("^Натиска бутона за създаване на резервация$")
	public void clickReservationButton() throws Throwable {
		reservationScreen.clickReservationButton();
	}

	@Then("^Съобщение \"([^\"]*)\"$")
	public void checkReservationMessage(final String message) throws Throwable {
		assertEquals(message, reservationScreen.getReservationMessage());
	}
	
}
