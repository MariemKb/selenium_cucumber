package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AdminPage extends BasePage{

	@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']")
	private static WebElement moduleAdmin;

	@FindBy(how = How.XPATH, using = "//span[@data-v-13cf171c='' and text()='Admin']")
	private static WebElement userRoleInput;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type for hints...']")
	private static WebElement emplyeeNameInput;

	@FindBy(how = How.XPATH, using = "//span[@data-v-13cf171c and text()='Enabled']")
	private static WebElement statusInput;

	@FindBy(how = How.XPATH, using = "//input[@class='oxd-input oxd-input--active oxd-input--error']")
	private static WebElement usernameInput;
	
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	private static WebElement pwdInput;
	
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	private static WebElement confirmPwd ;
	
	
	public AdminPage() {
		super(Setup.getDriver());
	}


	public static WebElement getModuleAdmin() {
		return moduleAdmin;
	}
	
	public static WebElement getUserRoleinput() {
		return userRoleInput;
	}
	public static WebElement getEmplyeeNameinput() {
		return emplyeeNameInput;
	}
	public static WebElement getStatusinput() {
		return statusInput;
	}
	public static WebElement getUsername() {
		return usernameInput;
	}
	public static WebElement getPassword() {
		return pwdInput;
	}
	
	public static WebElement getConfirmPwd() {
		return confirmPwd;
	}

}
