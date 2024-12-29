package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.ConnexionPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConnexionSteps {

	private ConnexionPage connexionPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;
	private Validations validations;

	public ConnexionSteps() {
		connexionPage = new ConnexionPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}

	@Given("Login page is opened")
	public void jeMeConnecteSurOrange() {
		seleniumUtils.get(configFileReader.getProperty("home.url"));
	}

	@When("the user set the login {string}")
	public void jeSaisisLeUsernameValide(String name) throws InterruptedException {
		seleniumUtils.writeText(ConnexionPage.getUsername(), name);
	}

	@When("the user set the pwd {string}")
	public void jeSaisisLeMotDePasseValide(String password) {
		seleniumUtils.writeText(ConnexionPage.getPassword(), password);
	}

	@When("the user click on the login button")
	public void jeCliqueSurLogin() {
		seleniumUtils.click(ConnexionPage.getBtnLogin());
	}
	
	@Then("the user is redirected to Dashboard {string}")
	public void jeMeRedirigeVersDashboard(String text) {
		validations.assertEquals(ConnexionPage.getUserHome(), text);
	}

}
