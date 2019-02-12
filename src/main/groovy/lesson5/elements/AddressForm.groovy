package lesson5.elements

import lesson5.model.AddressData

import static com.codeborne.selenide.Selenide.$

class AddressForm {
    void fillAddressForm(AddressData addressData) {
        navigationAddressForm("firstname", addressData.firstname)
        navigationAddressForm("lastname", addressData.lastname)
        navigationAddressForm("address1", addressData.address1)
        navigationAddressForm("postcode", addressData.postcode)
        navigationAddressForm("city", addressData.city)
        navigationAddressForm("phone", addressData.phone)
        navigationAddressForm("email", addressData.email)


    }

    void navigationAddressForm(String fieldParam, String fieldValue) {
        $(".billing-address").$x(".//input[@name = '$fieldParam']").value = fieldValue

    }
}
