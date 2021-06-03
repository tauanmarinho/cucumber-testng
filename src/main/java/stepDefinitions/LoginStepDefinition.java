package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition{
	
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
	 	System.out.println("user_already_on_login_page");
	 }
	
	 @When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_free_CRM(){
		 System.out.println("title_of_login_page_is_free_CRM");
	 }
	
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password){
		 System.out.println("user_enters_username_and_password");
	 }
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
		 System.out.println("user_clicks_on_login_button");
	 }

	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
		 System.out.println("user_is_on_hopme_page");
	 }
	 
	 @Then("^user moves to new contact page$")
	 public void user_moves_to_new_contact_page() {
		 System.out.println("user_moves_to_new_contact_page");
	 }

	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	 public void user_enters_contacts_details(String firstname, String lastname, String position){
		 System.out.println("user_enters_contacts_details");
	 }

	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 System.out.println("close_the_browser");
	 }
}
