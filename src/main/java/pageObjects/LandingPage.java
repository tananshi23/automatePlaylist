package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//webelements and business logics

public class LandingPage extends BasePage{

   WebDriver driver;

    @Override
    public boolean isPageLoaded() {
        return driver.getTitle().contains("landing");
    }

    public LandingPage(WebDriver driver){        // constructor - this property belongs to whole class
     //  driver = new ChromeDriver(); //instance or object
       this.driver = driver; //line no.9 driver = line no.10 driver
       driver.get("https://youtube.com");
    }
    private By logo = By.cssSelector("svg[id='yt-ringo2-svg_yt4']"); //Encapsulation - we have to keep all the locators in one place
    private By signin = By.cssSelector("a[aria-label=\"Sign in\"]");

    public boolean validateLogo(){

       return driver.findElement(logo).isDisplayed(); //findElement is an attribute of object and not of class
        //return logoDisplay;
    }
    public boolean validateSignInButton(){

       return driver.findElement(signin).isDisplayed();
    }

    public void clickSignIn(){

        driver.findElement(signin).click();

    }
    private By email = By.xpath("//input[@aria-label=\"Email or phone\"]");
    private By nextBtn = By.xpath("//span[text()=\"Next\"]");
    private By password = By.xpath("//input[@aria-label=\"Enter your password\"]");

    public void enterEmail(String emailId){

        driver.findElement(email).sendKeys(emailId);
    }
    public void cliclNext() throws InterruptedException {

        driver.findElement(nextBtn).click();
      //  Thread.sleep(5000);
    }

    public void enterPwd(String pwd){

        driver.findElement(password).sendKeys(pwd);
    }







}
