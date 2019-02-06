package lesson11


import groovy.util.logging.Slf4j
import org.testng.annotations.Test

import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.logevents.SelenideLogger.addListener

@Slf4j
class ToolsSearch extends BaseTest {


    @Test
    void gradleSearchTest() {
        addListener("LogListener", new LogListener())
        responseUrlList("Gradle")
    }

    @Test
    void groovySearchTest() {
        addListener("LogListener", new LogListener())
        responseUrlList("Groovy")
    }

    @Test
    void testNGSearchTest() {
        addListener("LogListener", new LogListener())
        responseUrlList("TestNG")
    }

    static String responseUrlList(String textRequest) {
        def searchField = $("#text")
        searchField.value = textRequest
        $(".search2__button").click()
        def urlList = $("a[href^=\"http\"]").getAttribute("href")//.shouldBe(CollectionCondition.sizeGreaterThan(1))
//        urlList.each {
//            $("a[href^=\"http\"]").getAttribute("href")
//        }
    }
}
