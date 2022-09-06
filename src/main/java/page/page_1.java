package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class page_1 {

	WebDriver driver;

	public void findElements(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='data']")
	WebElement ADD_INPUT_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/input[2]")
	WebElement ADD_BUTTON;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]")
	WebElement REMOVE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]")
	WebElement TOGGLE_ALL_CLICK;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]")
	WebElement TOGGLE_ALL_RECLICK;
	@FindBy(how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li[1]/input")
	WebElement CHOOSE_ONE_TOGGLE;
	
	public void addInputElement(String something) {
		ADD_INPUT_ELEMENT.sendKeys(something );
	}

	public void clickAddButton() {
		ADD_BUTTON.click();
	}
	public void clickRemoveButtonElement() {
		REMOVE_BUTTON_ELEMENT.click();
	}
	public void clickToggleAllElement() {
		TOGGLE_ALL_CLICK.click();
	}
	public void clickToggleAllElementAgain() {
		TOGGLE_ALL_RECLICK.click();
	}
	public void chooseOneToggle() {
	CHOOSE_ONE_TOGGLE.click();
	}

}
