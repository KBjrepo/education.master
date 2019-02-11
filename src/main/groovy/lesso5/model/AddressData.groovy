package lesso5.model

class AddressData {

    private firstname
    private lastname
    private address1
    private postcode
    private city
    private phone
    private email

    AddressData(String firstname, String lastname, String address1, String postcode, String city, String phone, String email) {
        this.firstname = firstname
        this.lastname = lastname
        this.address1 = address1
        this.postcode = postcode
        this.city = city
        this.phone = phone
        this.email = email
    }

    String getFirstname() {
        return firstname;
    }

    String getLastname() {
        return lastname;
    }

    String getAddress() {
        return address1;
    }

    String getPostCode() {
        return postcode;
    }

    String getCity() {
        return city;
    }

    String getPhone() {
        return phone;
    }

    String getEmail() {
        return email;
    }


}