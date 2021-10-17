package jpa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ADDRESS_ID", referencedColumnName = "ID")
    private Address address;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<ContactInfo> contactInfos;

    //CONSTRUCTOR
    public User(){
        contactInfos = new HashSet<>();
    }

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<ContactInfo> getContactInfos() {
        return contactInfos;
    }

    public void setContactInfos(Set<ContactInfo> contactInfos) {
        this.contactInfos = contactInfos;
    }
}
