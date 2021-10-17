package jpa.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USER")
public class User implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="USER_ID")
    private Long userId;

    @Column(name="FIRST_NAME", nullable = false, length = 30)
    private String firstName;

    @Column(name="SURNAME", nullable = false, length = 30)
    private String surName;

    @Column(name="PASSWORD", nullable = false, length = 30)
    private String password;

    @Column(name="USERNAME", nullable = false, length = 30)
    private String userName;

    @Column(name="LEVEL", nullable = false)
    private Integer level;

    @Column(name="POINTS", nullable = false)
    private Integer points;

    @Column(name="GENDER", nullable = false, length = 30)
    private String gender;

    @Column(name="ADDRESS", nullable = false)
    @OneToMany
    private Long addressId;

    @Column(name="CONTACT_INFO", nullable = false)
    @OneToMany
    private Long contactInfo;

    //CONSTRUCTOR
    public User(){}

    //GETTERS - SETTERS
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Long contactInfo) {
        this.contactInfo = contactInfo;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "User {" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", level=" + level +
                ", points=" + points +
                ", gender='" + gender + '\'' +
                ", addressId=" + addressId +
                ", contactInfo=" + contactInfo +
                '}';
    }
}
