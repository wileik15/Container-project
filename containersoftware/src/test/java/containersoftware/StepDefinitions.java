package containersoftware;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	//Successful login
	Client client = new Client("john123", "password");
	ResponceObject responce;
	
	@Given("a client with a valid account")
	public void a_client_with_a_valid_account() {
		client.setType('C');
	}

	@Given("login status is (true|false)$")
	public void login_status_is_false(boolean isLoggedIn) {
		client.setLoginStatus(isLoggedIn);
	}

	@When("enter correct username and password")
	public void enter_correct_username_and_password() {
		responce = client.logIn("john123", "password");
	}

	@Then("Displays message about successful login")
	public void displays_message_about_successful_login() {
		assertEquals(responce.getErrorMessage(), "Logged in");
	}
	
	//unsuccessful login
	
	@When("enter incorrect username and password")
	public void enter_incorrect_username_and_password() {
		responce = client.logIn("john123", "pass");
	}

	@Then("Displays message about unsuccessful login")
	public void displays_message_about_unsuccessful_login() {
		assertEquals(responce.getErrorMessage(), "Incorrect username or password");
	}
	
	//successful logout
	
	@When("press logout")
	public void press_logout() {
		responce = client.logOut();
	}

	@Then("Displays message about successful logout")
	public void displays_message_about_successful_logout() {
		assertEquals(responce.getErrorMessage(), "Successfully logged out");
	}
	
	//Updating account info
	
	@When("Entered new account info")
	public void entered_new_account_info() {
		client.setFirstName("John");
		client.setLastName("Smith");
		client.setEmail("johnsmith@gmail.com");
	}

	@Then("Displays message about updated account info")
	public void displays_message_about_updated_account_info() {
		assertEquals(client.getFirstName(), "John");
		assertEquals(client.getLastName(), "Smith");
		assertEquals(client.getEmail(), "johnsmith@gmail.com");
	}
	
	//Accessing container info
	
	@Given("account has valid shipments")
	public void account_has_valid_shipments() {
		client.addShipments(new Order());
		client.getShipment(0).setCargo("Bananas");
	}

	@When("access container info")
	public void access_container_info() {
		responce = client.hasShipments();
	}

	@Then("Displays message about basic container logistic information")
	public void displays_message_about_basic_container_logistic_information() {
		assertEquals(responce.getErrorMessage(), "Has shipments");
		assertEquals(client.getShipment(0).getCargo(), "Bananas");
	}
	
	//No current shipments
	
	@Given("account has no valid shipments")
	public void account_has_no_valid_shipments() {
		responce = client.hasShipments();
	}

	@Then("Displays message about no valid shipments")
	public void displays_message_about_no_valid_shipments() {
		assertEquals(responce.getErrorMessage(), "Has no shipments");
	}

}
