package lesson5

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide
import lesson5.model.AddressData
import lesson5.elements.AddressForm
import lesson5.pages.CheckoutPage
import lesson5.steps.AddToCartSteps
import lesson5.steps.ConfirmOrderSteps
import org.testng.annotations.Test

class ProductOrder extends AddressForm {
    @Test
    void testProductOrder() {
        Selenide.open("http://litecart.stqa.ru/en/")
        AddToCartSteps.addRandomProductToCart()
        fillAddressForm(new AddressData("1", "2", "4", "420066", "Midnight", "+78005556565", "xxx@xx.ru"))
        CheckoutPage.getSaveChangeButton().shouldNotHave(Condition.disabled).click()
        ConfirmOrderSteps.fillComment("Вырази ложную мысль ясно, и она сама себя опровергнет")
        ConfirmOrderSteps.confirmOrder()
        ConfirmOrderSteps.checkIsSuccessOrder()
    }
}

