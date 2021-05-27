package model;

public class Customer {
    public String nameCustomer;
    public String birthDay;
    public String gender;
    public String numberCMND;
    public String numberPhone;
    public String email;
    public String typeOfGuest;
    public String address;
    public Services services;

    public Customer() {
    }

    public Customer(String nameCustomer, String birthDay, String gender, String numberCMND, String numberPhone, String email, String typeOfGuest, String address) {
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.gender = gender;
        this.numberCMND = numberCMND;
        this.numberPhone = numberPhone;
        this.email = email;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String nameCustomer, String birthDay, String gender, String numberCMND, String numberPhone, String email, String typeOfGuest, String address, Services services) {
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.gender = gender;
        this.numberCMND = numberCMND;
        this.numberPhone = numberPhone;
        this.email = email;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
        this.services = services;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumberCMND() {
        return numberCMND;
    }

    public void setNumberCMND(String numberCMND) {
        this.numberCMND = numberCMND;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String showInfor() {
        return
                "nameCustomer='" + nameCustomer + '\'' +
                        ", birthDay='" + birthDay + '\'' +
                        ", gender='" + gender + '\'' +
                        ", numberCMND='" + numberCMND + '\'' +
                        ", numberPhone='" + numberPhone + '\'' +
                        ", email='" + email + '\'' +
                        ", typeOfGuest='" + typeOfGuest + '\'' +
                        ", address='" + address;
    }
}
