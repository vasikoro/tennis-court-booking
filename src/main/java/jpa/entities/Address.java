package jpa.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ADDRESS")
public class Address  implements Serializable {

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name=" ID", unique = true, nullable = false)
    private Long addressId;

    @Column(name="COUNTRY", nullable = false)
    private String country;

    @Column(name="STATE", nullable = false)
    private String state;

    @Column(name="CITY", nullable = false)
    private String city;

    @Column(name="STREET", nullable = false)
    private String street;

    @Column(name="NUMBER", nullable = false)
    private String number;

    @Column(name="POSTAL_CODE", nullable = false)
    private String postalCode;

    @Column(name="LATITUDE")
    private Float latitude;

    @Column(name="LONGITUDE")
    private Float longitude;

    //CONSTRUCTOR
    public Address() {}

    //GETTERS - SETTERS
    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
