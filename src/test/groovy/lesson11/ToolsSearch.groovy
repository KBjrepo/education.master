package lesson11

import com.codeborne.selenide.CollectionCondition
import groovy.util.logging.Slf4j
import org.testng.annotations.Test

import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.Selenide.$$

@Slf4j
class ToolsSearch extends BaseTest {


    @Test(groups = ["TEST_A"])
    void gradleSearchTest() {
        responseUrlList("Gradle")
    }

    @Test(groups = ["TEST_B"])
    void groovySearchTest() {
        responseUrlList("Groovy")
    }

    @Test(groups = ["TEST_C"])
    void testNGSearchTest() {
        responseUrlList("TestNG")
    }

    static String responseUrlList(String textRequest) {
        def searchField = $("#text")
        searchField.value = textRequest
        $(".search2__button").click()
        def urlList = $$(".organic__url").shouldBe(CollectionCondition.sizeGreaterThan(1))
        urlList.each {
            Thread.currentThread().sleep(200)
            log.info("Нашли запись $textRequest: ${it.getAttribute("href")}")
        }
    }
}
