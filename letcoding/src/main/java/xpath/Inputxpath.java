package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class Inputxpath extends POMInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		POMInput page = new POMInput();
		page.settings();
		PageFactory.initElements(driver, page);
		workspace.click();
		input.click();

		//Enter your full name
		fullname.sendKeys("Durka Rajakulendiran");

		//Append a text and press keyboard tab
		keyboardtab.sendKeys("person",Keys.TAB );

		//What is inside the text box
		String myValue= insidebox.getAttribute("value");
		System.out.println(myValue);

		//Clear the text
		cleartext.clear();

		//Confirm edit field is disabled
		boolean isEdit= disabled.isEnabled();
		System.out.println(isEdit);

		//Confirm text is readonly
		String isReadOnly= readonly.getAttribute("readonly");
		System.out.println(isReadOnly);
	}

}
