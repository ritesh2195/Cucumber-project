 package CBPack.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class agreeTerm {
	
		WebDriver driver;
		
		@FindBy(id="cgv")
		public WebElement agreeTerm1;
		
		@FindBy(name="processCarrier")
		public WebElement proceedCheckout3;
		
		public agreeTerm(WebDriver driver) {
			
		this.driver=driver;	
		
		//PageFactory.initElements(driver, this);
		
		}
		public void agreeTerm1() {
			
		agreeTerm1.click();
		
		proceedCheckout3.click();
			
			
		}	
		
	}
