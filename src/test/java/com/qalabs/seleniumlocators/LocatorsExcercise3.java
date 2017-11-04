package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LocatorsExcercise3 {
    public static void main (String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        myDriver.get("https://www.nasa.gov/");
        //System.out.println("Page URL.-" + myDriver.getCurrentUrl());
        //System.out.println("Page Title.-" + myDriver.getTitle());
        WebElement misiones = myDriver.findElement(By.linkText("Missions"));
        System.out.println(misiones.getAttribute("href"));
        WebElement tv = myDriver.findElement(By.linkText("NASA TV"));
        System.out.println(tv.getAttribute("href"));
        WebElement mars = myDriver.findElement(By.partialLinkText("Mars"));
        System.out.println(mars.getAttribute("href"));
        WebElement input = myDriver.findElement(By.tagName("input"));
        System.out.println(input.getAttribute("id"));
        myDriver.quit();
    }
}
