package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arranque {
    public WebDriver driver;
    private String url;

    public void arrancaDriver(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sergio\\IdeaProjects\\PruebaUno\\drivers\\Chromedriver_113.exe");
        this.driver = new ChromeDriver();
        driver.get(url);
    }

}
