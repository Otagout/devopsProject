package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class alertTest extends BaseTest {

    @Test
    @Description("Verify modal popup can be opened and closed")
    void handleModal() {

        driver.get("https://formy-project.herokuapp.com/modal");

        driver.findElement(By.id("modal-button")).click();

        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );

        var modal = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("modal-content")
                )
        );

        assertTrue(modal.isDisplayed());
    }
}