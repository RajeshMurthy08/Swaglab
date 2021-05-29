package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import config.Constants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckOutPage {

	public CheckOutPage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = Constants.TXT_USERNAME)
	public WebElement txtUsername;	
	@AndroidFindBy(xpath = Constants.TXT_PASSWORD)
	public WebElement txtPassword;	
	@AndroidFindBy(xpath = Constants.BTN_LOGIN)
	public WebElement btn_Login;
	@AndroidFindBy(xpath = Constants.HDR_HOMEPAGE)
	public WebElement hdr_HomePage;
	@AndroidFindBy(xpath = Constants.BTN_ADDTOCART)
	public WebElement btn_AddtoCart;
	@AndroidFindBy(xpath = Constants.BTN_REMOVE)
	public WebElement btn_Remove;
	@AndroidFindBy(xpath = Constants.TXT_PRDTNAME)
	public WebElement txt_PrdtName;
	@AndroidFindBy(xpath = Constants.BTN_BACK2PRDT)
	public WebElement btn_Back2Prdt;
	@AndroidFindBy(xpath = Constants.BTN_CHANGEVIEW)
	public WebElement btn_changeView;
	@AndroidFindBy(xpath = Constants.ICON_REMOVE)
	public WebElement icon_Remove;
	@AndroidFindBy(xpath = Constants.ICON_A2C)
	public WebElement icon_A2C;
	@AndroidFindBy(xpath = Constants.ICON_CART)
	public WebElement icon_Cart;
	@AndroidFindBy(xpath = Constants.HDR_CART)
	public WebElement hdr_Cart;
	@AndroidFindBy(xpath = Constants.BTN_CONTINUESHOPPING)
	public WebElement btn_ContinueShopping;
	@AndroidFindBy(xpath = Constants.BTN_CHECKOUT)
	public WebElement btn_CheckOut;
	@AndroidFindBy(xpath = Constants.HDR_CHECKOUT)
	public WebElement hdr_Checkout;
	@AndroidFindBy(xpath = Constants.BTN_CHKOUTCONTINUE)
	public WebElement btn_ChkOutContinue;
	@AndroidFindBy(xpath = Constants.BTN_CANCEL)
	public WebElement btn_Cancel;
	@AndroidFindBy(xpath = Constants.ERRTXT_FN)
	public WebElement errTxt_FN;
	@AndroidFindBy(xpath = Constants.ERRTXT_LN)
	public WebElement errTxt_LN;
	@AndroidFindBy(xpath = Constants.ERRTXT_PSC)
	public WebElement errTxt_PsC;
	@AndroidFindBy(xpath = Constants.FLD_FN)
	public WebElement fld_FN;
	@AndroidFindBy(xpath = Constants.FLD_LN)
	public WebElement fld_LN;
	@AndroidFindBy(xpath = Constants.FLD_PSC)
	public WebElement fld_PsC;
	@AndroidFindBy(xpath = Constants.HDR_OVERVIEW)
	public WebElement hdr_OverView;
	@AndroidFindBy(xpath = Constants.BTN_FINISH)
	public WebElement btn_Finish;	
	@AndroidFindBy(xpath = Constants.BTN_BACK2HOME)
	public WebElement btn_Back2Home;	
	@AndroidFindBy(xpath = Constants.HDR_CONFIRM)
	public WebElement hdr_Confirm;
	@AndroidFindBy(xpath = Constants.TXT_CONFIRM)
	public WebElement txt_Confirm;
	@AndroidFindBy(xpath = Constants.BTN_LOGOUT)
	public WebElement btn_Logout;
	@AndroidFindBy(xpath = Constants.BTN_MENU)
	public WebElement btn_Menu;
	
	
	
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
	        ".scrollIntoView(new UiSelector().textContains(\"REMOVE\"))")
   public WebElement scrl_remove;
	
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
	        ".scrollIntoView(new UiSelector().textContains(\"FINISH\"))")
   public WebElement scrl_finish;

	
	
	
	
	
	
	
	
	
	
	public void login(String username, String password) {
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
		btn_Login.click();		
	}
	
	public void lndPg() {
		Assert.assertTrue("Verify landing page header", hdr_HomePage.isDisplayed());
	}
	
	public void viewA2CBtn(String addtocart) {
		Assert.assertEquals("Verify Add to cart text button", addtocart,btn_AddtoCart.getText());
	}
	
	public void clickA2CBtn(){
		btn_AddtoCart.click();
	}
	
	public void viewRmvBtn(String removeBtn) {
		Assert.assertEquals("Verify remove button", removeBtn,btn_Remove.getText());
					}
	
	public void clickRmvBtn() {
		btn_Remove.click();
					}
	public void navigate2Prdt() {		
		Assert.assertTrue("Verify Product text", txt_PrdtName.isDisplayed());
		txt_PrdtName.click();
		Assert.assertTrue("Verify remove", scrl_remove.isDisplayed());
		
		
			}		
		
	public void tapBk2Prdt() {
		Assert.assertTrue("Verify Back to product button", btn_Back2Prdt.isDisplayed());
		btn_Back2Prdt.click();
					}
	
	public void tapPgViewBtn() {
		Assert.assertTrue("Verify view change button", btn_changeView.isDisplayed());
		btn_changeView.click();
	}
	
	public void viewRmvIcon() {
		Assert.assertTrue("Verify remove Icon in list view", icon_Remove.isDisplayed());
	}
	
	public void tapRmvIcon() {
		icon_Remove.click();
	}
	
	public void viewA2CIcon() {
		Assert.assertTrue("Verify Add to cart icon in list view", icon_A2C.isDisplayed());
			}
	
	public void tapA2CIcon() {
		icon_A2C.click();
			}
	
	public void tapCart() {
		Assert.assertTrue("Verify Cart Icon", icon_Cart.isDisplayed());		
		icon_Cart.click();
			}
	
	public void viewCartLndPg() {
		Assert.assertTrue("Verify cart landing page",hdr_Cart.isDisplayed());		
		Assert.assertTrue("Verify Continue shopping button",btn_ContinueShopping.isDisplayed());	
		Assert.assertTrue("Verify checkout button",btn_CheckOut.isDisplayed());			
			}
	
	public void tapCheckout() {
		Assert.assertTrue("Verify checkout button",btn_CheckOut.isDisplayed());		
		btn_CheckOut.click();
			}
	
	public void chkOutLndPg() {
		Assert.assertTrue("Verify Check out landing page header",hdr_Checkout.isDisplayed());		
		Assert.assertTrue("Verify Continue button",btn_ChkOutContinue.isDisplayed());	
		Assert.assertTrue("Verify cancel button",btn_Cancel.isDisplayed());			
			}
		
	public void tapContinueBtn() {
		Assert.assertTrue("Verify Continue button",btn_ChkOutContinue.isDisplayed());	
		btn_ChkOutContinue.click();
			}
		
	public void errTxtFN(String FirstnameError) {
		Assert.assertEquals("Verify first name error text",FirstnameError, errTxt_FN.getText());	
					}
	
	public void sendvalueFN(String Firstnamevalue) {
		fld_FN.sendKeys(Firstnamevalue);
					}
	
	public void errTxtLN(String LastnameError) {
		Assert.assertEquals("Verify first name error text",LastnameError, errTxt_LN.getText());	
					}	
	
	public void sendvalueLN(String LastnameError) {
		fld_LN.sendKeys(LastnameError);
					}

	public void errTxtPostCode(String postcodeError) {
		Assert.assertEquals("Verify first name error text",postcodeError, errTxt_PsC.getText());	
					}	
	
	public void sendvaluePsC(String PostCodevalue) {
		fld_PsC.sendKeys(PostCodevalue);
					}
	
	public void validateOverviewPage() {
		Assert.assertTrue("Verify overview page",hdr_OverView.isDisplayed());
					}
	
	public void tapFinish(String Finishbtn) {
		Assert.assertTrue("Verify and scroll to finish button", scrl_finish.isDisplayed());
		Assert.assertEquals("Verify overview page",Finishbtn, btn_Finish.getText());
		btn_Finish.click();		
					}
	
	public void tapCancel() {
		btn_Cancel.click();
	}
	
	public void tapContinueshopingBtn(String ContinueshoppingBtn) {
		Assert.assertEquals("Verify overview page",ContinueshoppingBtn, btn_ContinueShopping.getText());
		btn_ContinueShopping.click();	
	}
	
	public void Orderconfirmpage() {
		Assert.assertTrue("Verify confirm page header", hdr_Confirm.isDisplayed());
		Assert.assertTrue("Verify Thank you message", txt_Confirm.isDisplayed());
		Assert.assertTrue("Verify Thank you message",btn_Back2Home.isDisplayed());
			}

	public void logout() {
		btn_Menu.click();
		btn_Logout.click();		
			}
	
	
}
