 package CBPack.Page;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
	
	public class addToCart {
		
	WebDriver driver;
	
	@FindBy(xpath="//*[text()='Add to cart']")
	public WebElement addToCart;
	
	@FindBy(id="quantity_wanted")
	public WebElement qualityWanted;
	
	@FindBy(id="group_1")
	public WebElement Size;
	
	@FindBy(id="color_13")
	public WebElement Colour;
	
	@FindBy(xpath="//*[@title='Proceed to checkout']")
	public WebElement ProceedToCheckout;
	
	public addToCart(WebDriver driver) {
		
	this.driver=driver;
	
	//PageFactory.initElements(driver, this);
	
	}
	
	public void addCart() throws InterruptedException {
		
	qualityWanted.clear();
	
	qualityWanted.sendKeys("2");
	
	Select select=new Select(Size);
	
	select.selectByValue("2");
	
	Colour.click();
	
	addToCart.click();
	
	Thread.sleep(1000);
	
	ProceedToCheckout.click();
	
	}
	
	}
