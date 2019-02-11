package lesson5.elements

import lesso5.model.AddressData

import static com.codeborne.selenide.Selenide.$

class AddressForm {
    void fillAddressForm(AddressData addressData) {
        navigationAddressForm("firstname", addressData.getFirstname())
        navigationAddressForm("lastname", addressData.getLastname())
        navigationAddressForm("address1", addressData.getAddress())
        navigationAddressForm("postcode", addressData.getPostCode())
        navigationAddressForm("city", addressData.getCity())
        navigationAddressForm("phone", addressData.getPhone())
        navigationAddressForm("email", addressData.getEmail())


    }

    void navigationAddressForm(String fieldParam, String fieldValue) {
        $(".billing-address").$x(".//input[@name = '$fieldParam']").value = fieldValue

    }
}
