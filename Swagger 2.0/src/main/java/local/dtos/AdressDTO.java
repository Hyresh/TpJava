package local.dtos;

public class AdressDTO {
    private String street;
    private String city;
    private Long zipCode;

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

    public Long getZipCode() {
        return zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "AdressDTO{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
