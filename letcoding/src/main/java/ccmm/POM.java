package ccmm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM  extends Initialition{
	
	@FindBy(xpath  ="//a[@href='/test']")
	public static WebElement workspace;
	
	@FindBy(xpath  ="//a[@href='/buttons']")
	public static WebElement button;
	
	
	

}
