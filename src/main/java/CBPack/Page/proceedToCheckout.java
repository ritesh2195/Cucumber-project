 package CBPack.Page;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
	
	public class proceedToCheckout {
		
	WebDriver driver;
	
	@FindBy(className="standard-checkout")
	public WebElement proceedCheckout1;
	
	@FindBy(name="processAddress")
	public WebElement proceedCheckout2;
	
	public proceedToCheckout(WebDriver driver) {
		
	this.driver=driver;	
	
	//PageFactory.initElements(driver, this);
	
	}
	public void proceedCheckout() {
		
	proceedCheckout1.click();
	
	proceedCheckout2.click();
		
		
	}
	}
