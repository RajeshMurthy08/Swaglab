package steps;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.remote.DesiredCapabilities;

import config.Constants;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.CheckOutPage;

public class CheckOutStep {
		public AndroidDriver<AndroidElement> driver;
		CheckOutPage coPage;
	
		@Before
		public void setup() throws MalformedURLException {
			
			File appDirectory = new File("src/test/resources/application");
			File app = new File(appDirectory,"Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DevicePixel4");
			cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
			cap.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			coPage = new CheckOutPage(driver);			
					}
		

		@Given("^user logs in to the app with \"([^\"]*)\" and \"([^\"]*)\" in login page$")
		public void user_logs_in_to_the_app_with_and_in_login_page(String username, String password) throws MalformedURLException {
			coPage.login(username, password);
			System.out.println("given inside");
		}
		
		@Then("^user navigated to the home page$")
		public void user_navigated_to_the_home_page() {
			coPage.lndPg();			
		}
		
		@Then("^\"([^\"]*)\" text button should be displayed$")
		public void text_button_should_be_displayed(String addtocart) throws MalformedURLException {
			coPage.viewA2CBtn(addtocart);
					}
		
		@Then("^user taps on A2C button$")
		public void user_taps_on_A2C_button() {
			coPage.clickA2CBtn();			
		}
		
		@Then("^rmv \"([^\"]*)\"  button should be displayed$")
		public void rmv_button_should_be_displayed(String removeBtn) {
			coPage.viewRmvBtn(removeBtn);			
		}
		
		@When("^user taps on remove button$")
		public void user_taps_on_remove_button() {
			coPage.clickRmvBtn();			
		}
		

		@When("^navigates inside product$")
		public void navigates_inside_product() {
			coPage.navigate2Prdt();			
		}
		
		@When("^taps on Back to product button$")
		public void taps_on_Back_to_product_button() {
			coPage.tapBk2Prdt();			
		}
	
		@When("^taps on page view button$")
		public void taps_on_page_view_button() {
			coPage.tapPgViewBtn();			
		}
		
		@Then("^remove icon should be displayed$")
		public void remove_icon_should_be_displayed() {
			coPage.viewRmvIcon();			
		}
		
		@When("^user taps on remove icon$")
		public void user_taps_on_remove_icon() {
			coPage.tapRmvIcon();			
		}
		
		@Then("^A2C icon should be displayed$")
		public void A2C_icon_should_be_displayed() {
			coPage.viewA2CIcon();			
		}
		
		@When("^user taps on A2C icon$")
		public void user_taps_on_A2C_icon() {
			coPage.tapA2CIcon();			
		}
		
		@When("^selects cart icon$")
		public void selects_cart_icon() {
			coPage.tapCart();			
		}
		
		@Then("^cart landing page displayed$")
		public void cart_landing_page_displayed() {
			coPage.viewCartLndPg();
		}
		
		@When("^user taps on checkout button$")
		public void user_taps_on_checkout_button() {
			coPage.tapCheckout();			
		}
		
		@Then("^checkout info page should be displayed$")
		public void checkout_info_page_should_be_displayed() {
			coPage.chkOutLndPg();
		}
		
		@When("^taps on continue button$")
		public void taps_on_continue_button() {
			coPage.tapContinueBtn();
		}
		
		@Then("^firstname \"([^\"]*)\" should be displayed$")
		public void firstname_should_be_displayed(String FirstnameError) {
			coPage.errTxtFN(FirstnameError);
		}
		
		@When("^user fills checkout fields with \"([^\"]*)\" firstname$")
		public void user_fills_checkout_fields_with_firstname(String Firstnamevalue) {
			coPage.sendvalueFN(Firstnamevalue);
		}
		
		@Then("^lastname \"([^\"]*)\" should be displayed$")
		public void lastname_should_be_displayed(String LastnameError) {
			coPage.errTxtLN(LastnameError);
		}
		
		@When("^user fills checkout fields with \"([^\"]*)\" lastname$")
		public void user_fills_checkout_fields_with_lastname(String Lastnamevalue) {
			coPage.sendvalueLN(Lastnamevalue);
		}
				
		@Then("^postcode \"([^\"]*)\" should be displayed$")
		public void postcode_should_be_displayed(String postcodeError) {
			coPage.errTxtPostCode(postcodeError);
		}
		
		@When("^user fills checkout fields with \"([^\"]*)\" postcode$")
		public void user_fills_checkout_fields_with_postcode(String PostCodevalue) {
			coPage.sendvaluePsC(PostCodevalue);
		}
		
		@Then("^checkout overview page should be displayed$")
		public void checkout_overview_page_should_be_displayed() {
			coPage.validateOverviewPage();
		}
		
		@When("^user taps on \"([^\"]*)\" button$")
		public void user_taps_on_button(String Finishbtn) {
			coPage.tapFinish(Finishbtn);
		}
		
		
		@When("^user taps on cancel button$")
		public void user_taps_on_cancel_button() {
			coPage.tapCancel();
		}
		
		@When("^user taps on \"([^\"]*)\" continue shopping button$")
		public void user_taps_on_continue_shopping_button(String ContinueshoppingBtn) {
			coPage.tapContinueshopingBtn(ContinueshoppingBtn);
		}
		
		@When("^Order confirmation page should be displayed$")
		public void Order_confirmation_page_should_be_displayed() {
			coPage.Orderconfirmpage();
		}
	
		@Then("^user logs out$")
		public void user_logs_out() {
			coPage.logout();
		}
		
		
	}



