package tests;

import static java.lang.invoke.MethodHandles.lookup;
import static org.assertj.core.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

import org.example.Arranque;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

public class ChromeTests extends Arranque {

    static final Logger log = getLogger(lookup().lookupClass());
    private final String URL = "https://bonigarcia.dev/selenium-webdriver-java/";

    @Test
    void test() {
        arrancaDriver(URL);
        String title = driver.getTitle();
        log.debug("The title of {} is {}", URL, title);
        assertThat(title).contains("Selenium WebDriver");
        System.out.println("Test ChromeTests OK");
        driver.quit();
    }
}
