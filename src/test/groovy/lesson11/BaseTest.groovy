package lesson11

import com.codeborne.selenide.Selenide
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod

class BaseTest {

    @BeforeMethod(alwaysRun = true)
    protected setUp() {
        Selenide.open("https://ya.ru/")
    }

    @AfterMethod(alwaysRun = true)
    protected tearDown() {
        Selenide.close()
    }
}
