 package CBPack.Page;

   import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
   import org.openqa.selenium.support.FindBy;
	
	public class SearchIteam {
		
	WebDriver driver;
		
	@FindBy(id="search_query_top")
	public WebElement Search;
		
	@FindBy(name="submit_search")
	public WebElement SubmitSearch;	
	
	public SearchIteam(WebDriver driver) {
		
	this.driver=driver;	
	
	//PageFactory.initElements(driver, this);
		
	}
	
	public void searchItem(String text) {
		
	Search.sendKeys(text);
	
	SubmitSearch.click();
		
		
	}
}
