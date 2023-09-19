package session6.practice;

public class UserAdress {
    private String Country;
    private String streetName;
    private int streetNUmber;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNUmber() {
        return streetNUmber;
    }

    public void setStreetNUmber(int streetNUmber) {
        this.streetNUmber = streetNUmber;
    }
}
