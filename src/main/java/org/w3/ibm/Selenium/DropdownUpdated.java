package org.w3.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownUpdated {
    public static void main(String[] args) throws InterruptedException {
        String chromeURL = "C:\\Users\\GUILLERMOADRIANESTRA\\eclipse-workspace\\Selenium-Java\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeURL);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "--incognito");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.vivaaerobus.com/");

        Select s;

        driver.findElement(By.xpath("//*[@id=\"box-flight\"]/div[3]/div[3]/div/a")).click();

        for(int i = 0; i < 4; i++) {
            driver.findElement(By.xpath("//*[@id=\"counter-adults\"]/a[2]")).click();
        }

        int j = 0;
        while(j < 4) {
            driver.findElement(By.xpath("//*[@id=\"counter-children\"]/a[2]")).click();
            j++;
        }

        for(int i = 0; i < 3; i++) {
            driver.findElement(By.xpath("//*[@id=\"counter-infants\"]/a[2]")).click();
        }

        driver.findElement(By.xpath("//*[@id=\"#close-select-passengers\"]")).click();

        String result = driver.findElement(By.xpath("//*[@id=\"box-flight\"]/div[3]/div[3]/div/a/div")).getText();
        System.out.println(result);

        Thread.sleep(2000l);
        driver.quit();
    }
}
