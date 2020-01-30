 package CBPack.Page;

     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
     import org.openqa.selenium.support.FindBy;
	
	public class SelectItem {
	
	WebDriver driver;	
		
	@FindBy(xpath="//*[@title='Printed Summer Dress']")
	public WebElement PrintedSummerDress;
	
	@FindBy(xpath="//*[@title='Printed Dress']")
	public WebElement PrintedDress;
	
	@FindBy(xpath="//*[@title='Blouse']")
	public WebElement Blouse;
	
	@FindBy(xpath="//*[@title='Printed Chiffon Dress']")
	public WebElement PrintedChiffonDress;
	
	public SelectItem(WebDriver driver) {
		
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	}
	
	public void choosingItem() {
		
	PrintedSummerDress.click();
		
	}
	}
