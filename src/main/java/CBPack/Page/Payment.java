 package CBPack.Page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class Payment {
		
	WebDriver driver;
		
		@FindBy(xpath="//*[text()='(order processing will be longer)']")
		public WebElement PaymentOption1;
		
		@FindBy(xpath="//*[@title='Pay by check.']")
		public WebElement PaymentOption2;
		
		public Payment(WebDriver driver) {
			
		this.driver=driver;	
		
		PageFactory.initElements(driver, this);
		
		}
		public void payment() {
			
		//PaymentOption1.click();
		
		PaymentOption2.click();
			
			
		}	
		
	}
