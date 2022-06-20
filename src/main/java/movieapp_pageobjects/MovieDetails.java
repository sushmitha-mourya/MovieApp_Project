package movieapp_pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MovieDetails {

	public WebDriver driver;

	public MovieDetails(WebDriver driver) {

		this.driver = driver;

		// implementing page factory
		PageFactory.initElements(driver, this);
	}

//  Movie details page web elements

	@FindBy(xpath = ".//*[@id='movieDate']")
	List<WebElement> movieDate;

	@FindBy(css = "[id='popularRate']")
	List<WebElement> popularRate;

	@FindBy(className = "movieTitle")
	List<WebElement> movieTitle;

	@FindBy(id = "description")
	List<WebElement> movieDescription;

	public List<WebElement> getMovieDate() {

		return movieDate;
	}

	public List<WebElement> getMovieDescription() {

		return movieDescription;
	}

	public List<WebElement> getPopularRate() {

		return popularRate;
	}

	public List<WebElement> getMovieTitle() {

		return movieTitle;
	}

}
