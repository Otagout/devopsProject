package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DropDownTest extends BaseTest {

    @Test
    @Description("Verify user can select an option from dropdown")
    void selectDropdown() {

        driver.get(
                "https://formy-project.herokuapp.com/dropdown"
        );

        driver.findElement(
                By.id("dropdownMenuButton")
        ).click();

        driver.findElement(
                By.linkText("Autocomplete")
        ).click();

        assertEquals(
                "https://formy-project.herokuapp.com/autocomplete",
                driver.getCurrentUrl()
        );
    }
}