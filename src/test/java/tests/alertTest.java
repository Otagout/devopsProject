package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class alertTest extends BaseTest {

    @Test
    @Description("Verify modal popup can be opened and closed")
    void handleModal() {

        driver.get(
                "https://formy-project.herokuapp.com/modal"
        );

        driver.findElement(
                By.id("modal-button")
        ).click();

        var modal = driver.findElement(
                By.className("modal-content")
        );

        assertTrue(modal.isDisplayed());
    }
}