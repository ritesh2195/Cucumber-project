 package CBPack.Page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.ui.Select;
        import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
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
	
	PageFactory.initElements(driver, this);
	
	}
	
	public void addCart() {
		
	qualityWanted.clear();
	
	qualityWanted.sendKeys("2");
	
	Select select=new Select(Size);
	
	select.selectByValue("2");
	
	Colour.click();
	
	addToCart.click();
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
    
   	wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckout));
	
	ProceedToCheckout.click();
	
	}
	
	}
