package pages;

import org.openqa.selenium.WebDriver;

public class GooglePage {

    WebDriver driver;

    public GooglePage(WebDriver driver){
        this.driver = driver;
    }
public void openGoogle(){
    driver.get(System.getProperty("baseUrl","https://www.google.com"));
   }

    public String getTitle(){
        return driver.getTitle();
    }
}
