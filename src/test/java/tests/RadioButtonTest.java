package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RadioButtonTest extends BaseTest {

    @Test
    @Description("Verify radio button selection")
    void selectRadioButton() {

        driver.get(
                "https://formy-project.herokuapp.com/form"
        );

        var maleRadio = driver.findElement(
                By.id("radio-button-1")
        );

        maleRadio.click();

        assertTrue(maleRadio.isSelected());
    }
}