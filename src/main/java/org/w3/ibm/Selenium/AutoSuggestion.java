package org.w3.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class AutoSuggestion {
    public static void main(String[] args) throws InterruptedException {
        String chromeURL = "C:\\Users\\GUILLERMOADRIANESTRA\\eclipse-workspace\\Selenium-Java\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeURL);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "--incognito");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.xpath("//*[@id=\"autosuggest\"]")).sendKeys("Ja");
//        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]"));
        List<WebElement> elements = driver.findElements(By.cssSelector(".ui-menu-item"));

        for(WebElement element : elements){
            if(element.getText().equalsIgnoreCase("Japan")){
                element.click();
            }
        }

        System.out.println("The text in the box is: " + driver.findElement(By.xpath("//*[@id=\"autosuggest\"]")).getText());

        Thread.sleep(2000l);
        driver.quit();
    }
}
