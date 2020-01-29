	package stepDefinition;

	import org.junit.Assert;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Base.base;
import CBPack.Page.ConfirmationOrder;
import CBPack.Page.LaunchPage;
import CBPack.Page.Payment;
import CBPack.Page.SearchIteam;
	import CBPack.Page.SelectItem;
	import CBPack.Page.SignInPage;
	import CBPack.Page.addToCart;
import CBPack.Page.agreeTerm;
import CBPack.Page.proceedToCheckout;
import CBPack.util.Constant;
import cucumber.api.java.After;
	import cucumber.api.java.Before;
	import cucumber.api.java.en.And;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	
	public class login1 extends base {
		
//		public ExtentReports eReport;
//		public ExtentTest eTest;
	
	    @Before("@Login")
	    public void openBroser() {
	    	
	    intilize();
	    	
//	    eReport=ExtentManager.getInstance();	
//	    	
//	    eTest=eReport.startTest("ECommerce");
	    
	    openingBrowser();
	    
	   // eTest.log(LogStatus.INFO, "Browser got opened");
	     
	    }
	    	
		@Given("^I naviagate to launch page of the application and click on login link field$")
		public void i_naviagate_to_launch_page_of_the_application() {
		
		LaunchPage launchPage=new LaunchPage(driver);
		
		PageFactory.initElements(driver, launchPage);
		
		launchPage.SingInPage(Constant.APP_URL);
		
		//eTest.log(LogStatus.INFO, "Application url got launched");
			
		//driver.get(prop.getProperty("AppURL"));
		   
		}
		
		@When("^User enters the Username ([^\"]*) and Password ([^\"]*) into the fields$")
		public void user_enters_the_Username_and_Password_into_the_fields(String username, String password) throws InterruptedException {
			
		SignInPage sininPage=new SignInPage(driver);
			
		PageFactory.initElements(driver, sininPage);
			
		sininPage.DoSignin(Constant.USERNAME,Constant.PASSWORD );
		
		//eTest.log(LogStatus.INFO, "Type username and password");
		
		Thread.sleep(5000);
			
//		driver.findElement(By.name("email")).sendKeys(prop.getProperty("username"));
//		
//		driver.findElement(By.id("passwd")).clear();
//			
//	    driver.findElement(By.id("passwd")).sendKeys(prop.getProperty("password"));	
			
		}

		@When("^I click on Sign in button$")
		public void i_click_on_Sign_in_button()  {
			
		driver.findElement(By.id("SubmitLogin")).click();
		
		//eTest.log(LogStatus.INFO, "click on Signin button");
		
		}

		@Then("^user should be abale to succefully Login$")
		public void user_should_be_abale_to_succefully_Login() throws InterruptedException  {
			
		WebElement element=driver.findElement(By.xpath("//*[text()='My account']"));	
			
		if(element.isDisplayed()) {
				
		} else {
			
		Assert.fail("Login Test is failed");
			
		}
		
		Thread.sleep(5000);
		
		}	
		
		@Given("^I type ([^\"]*) in the search box and click on the search button field$")
		public void I_type_item_in_the_search_box(String items) {
		
		SearchIteam search=new SearchIteam(driver);
			
		PageFactory.initElements(driver, search);
			
		search.searchItem("dress");
			
		//eTest.log(LogStatus.INFO, "Search dress in search box and click on search button");
		
		}
		
		@And("^I select the particular item and click on the particular item$")
		public void I_select_the_particular_item() {
			
		SelectItem item=new SelectItem(driver);
		
		PageFactory.initElements(driver, item);
		
		item.choosingItem();
		
		//eTest.log(LogStatus.INFO, "Choose the item");
			
		}
		
		@When("^I click on the add item to cart field$")
		public void I_click_on_the_add_item_to_cart_field() throws InterruptedException {
			
		addToCart cart=new addToCart(driver);
			
		PageFactory.initElements(driver, cart);
		
		//eTest.log(LogStatus.INFO, "Add the item into the cart");
		
		try {
			
		cart.addCart();
		
		}catch(Exception e)	{
			
		e.printStackTrace();
		
		Thread.sleep(5000);
		}
		}
		
		@And("^I click on the proceed to checkout field$")
		public void I_click_on_the_proceed_to_checkout_field() {
			
		proceedToCheckout checkout=new proceedToCheckout(driver);
		
		PageFactory.initElements(driver, checkout);
		
		checkout.proceedCheckout();
		
		//eTest.log(LogStatus.INFO, "click on the proceed the checkout button");
			
		}
		
		@Then("^I click on agree term and proceed to checkout field$")
		public void I_click_on_agree_term_and_proceed_to_checkout_field() {
			
		agreeTerm term=new agreeTerm(driver);
		
		PageFactory.initElements(driver, term);
		
		term.agreeTerm1();
		
		//eTest.log(LogStatus.INFO, "click on the term and condition button");
			
		}
		
		@And("^I click on the payment field$")
		public void I_click_on_the_payment_field() throws InterruptedException {
			
		Payment payment1=new Payment(driver);
		
		PageFactory.initElements(driver, payment1);
		
		payment1.payment();
		
		//eTest.log(LogStatus.INFO, "Click on the payment option");
		
		Thread.sleep(10000);
		
		JavascriptExecutor jsExec = (JavascriptExecutor)driver;

		jsExec.executeScript("window.scrollBy(0,600)");

		}
		
		@Then("^I click on the confirm my order field$")
		public void I_click_on_the_confirm_my_order_field() throws InterruptedException {
			
		ConfirmationOrder confirm1=new ConfirmationOrder(driver);
		
		PageFactory.initElements(driver, confirm1);
		
		confirm1.confirm();
		
		//eTest.log(LogStatus.INFO, "Confirm the order");
		
		Thread.sleep(10000);
			
		}
		
		
		
		@After("@Login")
		public void closingBrowser() {
			
		driver.quit();
		
		//eTest.log(LogStatus.INFO, "Successfully close the browser");
		}
		
	}
