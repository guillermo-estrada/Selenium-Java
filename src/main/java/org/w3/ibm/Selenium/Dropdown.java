package org.w3.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        String chromeURL = "C:\\Users\\GUILLERMOADRIANESTRA\\eclipse-workspace\\Selenium-Java\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeURL);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "--incognito");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.spicejet.com/");

        Select s;

        driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();

        s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")));
        s.selectByValue("4");

        s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Child\"]")));
        s.selectByIndex(3);

        s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Infant\"]")));
        s.selectByVisibleText("2");

        s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")));
        s.selectByValue("USD");

        System.out.println(driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).getText());

        Thread.sleep(2000l);
        driver.quit();
    }
}
