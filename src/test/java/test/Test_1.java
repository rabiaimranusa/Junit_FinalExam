package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



import util.BrowserFactory;
import page.BasePage;
import page.page_1;

public class Test_1 extends BasePage {
	 WebDriver driver;
	  
	  @Test
	  public void landOnPage() {
	  
	  driver = BrowserFactory.init();

	page_1 objpage_1 = PageFactory.initElements(driver, page.page_1.class);
	objpage_1.addInputElement("ri" + generateRandomNo(999));
	objpage_1.clickAddButton();
	objpage_1.addInputElement("ri"+ generateRandomNo(999));
	objpage_1.clickAddButton();
	objpage_1.addInputElement("ri"+ generateRandomNo(999));
	objpage_1.clickAddButton();
	objpage_1.clickToggleAllElement();
	objpage_1.clickToggleAllElementAgain();
    objpage_1.chooseOneToggle();
    objpage_1.clickRemoveButtonElement();
	
    BrowserFactory.teardown(); 
	  } 
	  
}

