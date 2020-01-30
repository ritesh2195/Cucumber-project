 package CBPack.Page;

	import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
	
	public class ConfirmationOrder {
		
	WebDriver driver;
	
	@FindBy(xpath="//*[text()='I confirm my order']")
	public WebElement confirmOrder;
	
	public ConfirmationOrder(WebDriver driver) {
	
	this.driver=driver;	
		
	PageFactory.initElements(driver, this);
	
	}
	
	public void confirm() {
		
	confirmOrder.click();
		
	}
	
	}
