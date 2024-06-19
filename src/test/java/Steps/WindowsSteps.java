package Steps;

import org.junit.Assert;

import com.pages.LoginPage;
import com.pages.WindowsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WindowsSteps {
	
	private static String title;
	
	private WindowsPage wp=new WindowsPage(DriverFactory.getDriver());
	
	
	@Given("User should be on the practice page")
	public void user_should_be_on_the_practice_page() {
		DriverFactory.getDriver().get("https://rahulshettyacademy.com/AutomationPractice");
 
	}
 
	@When("user click on the open tab button")
	public void user_click_on_the_open_tab_button() throws InterruptedException {
		wp.opentab();
	}
 
	@Then("page will be navigated to the child page and contains the text")
	public void page_will_be_navigated_to_the_child_page_and_contains_the_text() {
		title = wp.getTextsss();
 
	}
 
	@Then("text should be displayed {string}")
	public void text_should_be_displayed(String expectedtext) {
	    if (title.contains(expectedtext)) {	        
	        System.out.println("Text contains the expected text: " + expectedtext);
	    } else {
	        System.out.println("Text does not contain the expected text: " + expectedtext);
	    }
	}

}
