package tests;

import org.example.Arranque;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Facebook extends Arranque {
    private final String URL = "https://es-es.facebook.com/";

    @Test
    public void test() {
        arrancaDriver(URL);
        clicBtnPopUpInicio();
        driver.quit();
    }

    private void clicBtnPopUpInicio() {
        WebElement element = driver.findElement(By.xpath("//div[@class='_10 _9o-w uiLayer _4-hy _3qw']//div[@class='_4t2a']//button[@class='_42ft _4jy0 _al65 _4jy3 _4jy1 selected _51sy']"));
        element.click();
    }
    //sube o no
}
