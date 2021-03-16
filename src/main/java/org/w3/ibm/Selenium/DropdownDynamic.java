package org.w3.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropdownDynamic {
    public static void main(String[] args) throws InterruptedException {
        String chromeURL = "C:\\Users\\GUILLERMOADRIANESTRA\\eclipse-workspace\\Selenium-Java\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeURL);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "--incognito");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.spicejet.com/");

        driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[3]/li[8]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[8]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[4]/a")).click();

        Thread.sleep(2000l);
        driver.quit();
    }
}
