import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsuarioFuncionalTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new FirefoxDriver();
    }

    @Test
    void testActualizarPeso() {
        String formPath = "file://"+System.getProperty("user.dir")+"/src/test/resources/formulario.html";
        driver.get(formPath);

        WebElement inputPeso = driver.findElement(By.id("peso"));
        inputPeso.sendKeys("72");

        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        submitBtn.click();

        WebElement resultado = driver.findElement(By.id("resultado"));
        assertTrue(resultado.getText().contains("72 kg"), "El peso mostrado deberia ser 72 kg");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
