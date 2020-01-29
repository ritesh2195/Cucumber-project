  package CBPack.Page;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class LaunchPage  {
		
	WebDriver driver;
	
	@FindBy(xpath="//*[text()='Contact us']")
	public WebElement Contactus;	
	
	@FindBy(xpath="//*[@title='Log in to your customer account']")
	public WebElement Signin;
	
	@FindBy(id="search_query_top")
	public WebElement Search;
	
	@FindBy(name="submit_search")
	public WebElement SubmitSearch;
	
	public LaunchPage(WebDriver driver) {
		
	this.driver=driver;	
	
	//PageFactory.initElements(driver, this);
		
	}
	
	public void SingInPage(String url) {
		
	driver.get(url);
		
	Signin.click();	
		
	}
		
	}
