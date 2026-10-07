package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormTest extends BaseTest {

    @Test
    @Description("Verify user can complete the Formy web form")
    void completeForm() {

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(
                org.openqa.selenium.By.id("first-name")
        ).sendKeys("Oussama");

        driver.findElement(
                org.openqa.selenium.By.id("last-name")
        ).sendKeys("Tagout");

        driver.findElement(
                org.openqa.selenium.By.id("job-title")
        ).sendKeys("Software Developer");

        driver.findElement(
                org.openqa.selenium.By.id("radio-button-2")
        ).click();

        driver.findElement(
                org.openqa.selenium.By.id("checkbox-1")
        ).click();

        assertEquals(
                "Software Developer",
                driver.findElement(
                        org.openqa.selenium.By.id("job-title")
                ).getAttribute("value")
        );
    }
}