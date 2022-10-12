public class Person {

    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private Integer zipCode;
    private Integer mobileNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + firstName + '\'' +
                ",LastName='" + lastName + '\'' +
                ",Street='" + street + '\'' +
                ",City='" + city + '\'' +
                ",State='" + state + '\'' +
                ",ZipCode'" + zipCode + '\'' +
                ",MobileNumber'" + mobileNumber + '\'' +
                '}';
    }
}

