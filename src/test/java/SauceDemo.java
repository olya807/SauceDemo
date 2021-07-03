import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.Console;
import java.io.File;
import java.util.List;

public class SauceDemo {

    @Test
    public void Test() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("drivers//chromedriver.exe").getFile());
        String absolutePath = file.getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", absolutePath);

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.saucedemo.com/");

        WebElement byId = chromeDriver.findElement(By.id("react-burger-menu-btn"));
        WebElement byName = chromeDriver.findElement(By.name("viewport"));
        WebElement byClassname = chromeDriver.findElement(By.className("footer_robot"));
        WebElement byTagName = chromeDriver.findElement(By.tagName("body"));
        WebElement byLinkText = chromeDriver.findElement(By.linkText("https://saucelabs.com/"));
        WebElement byPartialLinkText = chromeDriver.findElement(By.partialLinkText("celabs.com"));

        //Поиск по атрибуту, например By.xpath("//tag[@attribute='value']");
        WebElement byXpath = chromeDriver.findElement(By.xpath("//a[@id='about_sidebar_link']"));

        //Поиск по тексту, например By.xpath("//tag[text()='text']");
        WebElement byXpathText = chromeDriver.findElement(By.xpath("//span[text()='Products']"));

        //Поиск по частичному совпадению атрибута, например By.xpath("//tag[contains(@attribute,'text')]");
        WebElement byXpathPartialAttribute = chromeDriver.findElement(By.xpath("//span[contains(@class,'itl')]"));

        //Поиск по частичному совпадению текста, например By.xpath("//tag[contains(text(),'text')]");
        WebElement byXpathPartialText = chromeDriver.findElement(By.xpath("//span[contains(text(),'duc')]"));

        //ancestor, например //*[text()='Enterprise Testing']//ancestor::div
        WebElement byXpathAncestor = chromeDriver.findElement(By.xpath("//option[text()='Name (A to Z)']//ancestor::select"));

        //descendant
        WebElement byXpathDescendant = chromeDriver.findElement(By.xpath("//*[@id='menu_button_container']//descendant::nav"));

        //following
        WebElement byXpathFollowing = chromeDriver.findElement(By.xpath("//*[@type='password']//following::input"));

        //parent
        WebElement byXpathParent = chromeDriver.findElement(By.xpath("//*[@id='user-name']//parent::div[1]"));

        //preceding
        WebElement byXpathPreceding = chromeDriver.findElement(By.xpath("//*[@type='submit']//preceding::input[1]"));

        //Поиск элемента с условием AND, например //input[@class='_2zrpKA _1dBPDZ' and @type='text']
        WebElement byXpathWithAnd = chromeDriver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));


        //CssSelector
        //.class
        WebElement byCssClass = chromeDriver.findElement(By.cssSelector(""));

        //.class1.class2
        WebElement byCssClass1 = chromeDriver.findElement(By.cssSelector(""));

        //.class1 .class2
        WebElement byCssClass2 = chromeDriver.findElement(By.cssSelector(""));

        //#id
        WebElement byCssId = chromeDriver.findElement(By.cssSelector(""));

        //tagname
        WebElement byCssTagName = chromeDriver.findElement(By.cssSelector(""));

        //tagname.class
        WebElement byCssTagNameClass = chromeDriver.findElement(By.cssSelector(""));

        //[attribute=value]
        WebElement byCssAttributeValue1 = chromeDriver.findElement(By.cssSelector(""));

        //[attribute~=value]
        WebElement byCssAttributeValue2 = chromeDriver.findElement(By.cssSelector(""));

        //[attribute|=value]
        WebElement byCssAttributeValue3 = chromeDriver.findElement(By.cssSelector(""));

        //[attribute^=value]
        WebElement byCssAttributeValue4 = chromeDriver.findElement(By.cssSelector(""));

        //[attribute$=value]
        WebElement byCssAttributeValue5 = chromeDriver.findElement(By.cssSelector(""));

        //[attribute*=value]
        WebElement byCssAttributeValue6 = chromeDriver.findElement(By.cssSelector(""));
    }
}

