package selenium.stepss;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import selemiums.elementss.LoginElements;
import selenium.browsersetup.BrowserSetUpClasses;

public class StepsImplmentation extends BrowserSetUpClasses {
	
	public StepsImplmentation(WebDriver launchbrowsers) throws IOException, InterruptedException {
		super(launchbrowsers);
	}

	@Given("$Enter a Browser and URL Too^")
	public static void stepOne() throws IOException, InterruptedException
	{
	}
	
	
	@When("$Enter a Valid Username^")
	public static void stepTwo() throws IOException, InterruptedException
	{
		LoginElements.ValidatevalidUsername();
	}
	
	
	@Given("$Enter a Browser and URL Too^")
	public static void stepThree() throws IOException, InterruptedException
	{
		LoginElements.ValidateValidPassword();

	}
	
	
	@Given("$Enter a Browser and URL Too^")
	public static void stepFour() throws IOException, InterruptedException
	{
		LoginElements.ValidateValidPassword();

	}
	
	

}
