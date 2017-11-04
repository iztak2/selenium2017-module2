import com.qalabs.seleniumlocators.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

public class LocatorsExcerscise5 {
    public static void main (String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        myDriver.get("https://www.amazon.com.mx/");
        WebElement myDropdown = myDriver.findElement(By.id("searchDropdownDescription"));
        Select myDropDownSelect = new Select(myDropdown);
        System.out.println("Available options.- " +myDropDownSelect.getOptions());
        System.out.println("Multiple.- " +myDropDownSelect.isMultiple());
        System.out.println("select op.- " +myDropDownSelect.getFirstSelectedOption().getText());

        myDropDownSelect.selectByIndex(0);
        System.out.println("select op.- " +myDropDownSelect.getFirstSelectedOption().getText());
        Thread.sleep( 2000);

        myDropDownSelect.selectByValue("search-alias=automotive");
        System.out.println("select op.- " +myDropDownSelect.getFirstSelectedOption().getText());
        Thread.sleep( 2000);

        myDriver.quit();
    }

}
