package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.AdminPage;
import com.e2eTest.automation.page_objects.ConnexionPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminSteps {
	
	private AdminPage adminPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;
	private Validations validations;

	public AdminSteps() {
		adminPage = new AdminPage();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
	
	}
	
	@Then("the user click on admin module")
	public void theUserClickOnAdminModule() {
		seleniumUtils.click(AdminPage.getModuleAdmin());
	}
	
	@When("the user select a user Role {string}")
	public void theUserSelectAUserRole(String string) {
		seleniumUtils.click(AdminPage.getUserRoleinput());
	}
	@When("the user select a status {string}")
	public void theUserSelectAStatus(String string) {

		seleniumUtils.click(AdminPage.getStatusinput());
	}
	@When("the user enter an employee name {string}")
	public void theUserEnterAnEmployeeName(String employeeName) {
		seleniumUtils.writeText(AdminPage.getEmplyeeNameinput(), employeeName);
	}
	@When("the user enter a username {string}")
	public void theUserEnterAUsername(String username) {
	
			seleniumUtils.writeText(AdminPage.getUsername(), username);
	}
	@When("the user enter a password {string}")
	public void theUserEnterAPassword(String password) {
		
			seleniumUtils.writeText(AdminPage.getPassword(), password);
	}
	@When("the user confirm a password {string}")
	public void theUserConfirmAPassword(String confirmPassword) {
		seleniumUtils.writeText(AdminPage.getConfirmPwd(), confirmPassword);
	}
	@Then("an admin account is created")
	public void anAdminAccountIsCreated() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}







}
