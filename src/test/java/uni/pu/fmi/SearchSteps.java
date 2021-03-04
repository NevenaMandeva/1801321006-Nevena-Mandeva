package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.SearchScreenModel;

public class SearchSteps {

	SearchScreenModel searchScreen = new SearchScreenModel();

	@Given("^Клиентът зарежда страницата за резервация$")
	public void openReservationScreen() throws Throwable {
		searchScreen.navigateToMe();
	}

	@When("^Клиентът селектира държава от падащия лист \"([^\"]*)\"$")
	public void select(String country) throws Throwable {
		searchScreen.setCountry(country);

	}

	@When("^Селектира град от новогенериран лист за избраната държава \"([^\"]*)\"$")
	public void selectCity(String city) throws Throwable {
		searchScreen.setCity(city);
	}

	@When("^Селектира локация \"([^\"]*)\"$")
	public void selectLocation(String location) throws Throwable {
		searchScreen.setLocation(location);

	}

	@When("^Натиска бутона за търсене на фирми$")
	public void clickSearchButton() throws Throwable {
		searchScreen.clickSearchButton();

	}

	@Then("^Излиза съобщение \"([^\"]*)\"$")
	public void checkMessage(String message) throws Throwable {
		assertEquals(message, searchScreen.getSearchMessage());
	}

}
