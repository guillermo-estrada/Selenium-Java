package org.w3.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {
    public static void main(String[] args) {
        //Create Driver Object
        //For firefox
        //String firefoxURL = "C:\\Users\\GUILLERMOADRIANESTRA\\eclipse-workspace\\Selenium-Java\\src\\main\\resources\\geckodriver.exe";
        //System.setProperty("webdriver.gecko.driver", firefoxURL);
        //WebDriver driver = new FirefoxDriver();

        //For Chrome
        String chromeURL = "C:\\Users\\GUILLERMOADRIANESTRA\\eclipse-workspace\\Selenium-Java\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeURL);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://www.salesforce.com");

        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        //driver.get("http://www.youtube.com");
        //driver.navigate().back();

        driver.findElement(By.xpath("//*[@id=\"globalnavbar-header-container\"]/div[2]/div/div[5]/div/div/div[1]/a"))
                .click();

        driver.findElement(By.xpath("//*[@id=\"username\"]")) //*[@id="username"]
                .sendKeys("mymail@mail.com");

        driver.findElement(By.xpath("//*[@id=\"password\"]"))
                .sendKeys("mypassword123");

        driver.findElement(By.xpath("//*[@id=\"Login\"]"))
                .click();

        driver.quit();
    }
}
