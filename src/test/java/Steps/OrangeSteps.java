package Steps;

import com.pages.OrangeLogin;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OrangeSteps {
	
	
	private OrangeLogin os=new OrangeLogin(DriverFactory.getDriver());

//	@Given("user is on login page")
//	public void user_ison_login_page() {
//		
//		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	    
//	}
////
//	@When("user enters username {string}")
//	public void userenters_username(String username) throws InterruptedException {
//		
//		os.enterUserName(username);
//	}
//
//	@When("user enters password {string}")
//	public void userenters_password(String password) throws InterruptedException {
//		
//		os.enterPassword(password);
//	}
//
//	@When("user clicks on Login button")
//	public void userclicks_on_login_button() {
//		
//		os.clickOnLogin();
//		
//	}
}
