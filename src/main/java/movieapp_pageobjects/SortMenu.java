package movieapp_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortMenu {

	public WebDriver driver;

	public SortMenu(WebDriver driver) {

		this.driver = driver;

		// implementing page factory
		PageFactory.initElements(driver, this);
	}

//  sort menu web elements

	@FindBy(xpath = ".//*[@id='titleButton']")
	WebElement title;

	@FindBy(css = "[id='releaseDateButton']")
	WebElement rerleaseDate;

	@FindBy(name = "cancelButton")
	WebElement cancel;

	@FindBy(id = "clearButton")
	WebElement clear;

	public WebElement getTitle() {

		return title;
	}

	public WebElement getReleaseDate() {
		return rerleaseDate;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getClear() {
		return clear;
	}

}
