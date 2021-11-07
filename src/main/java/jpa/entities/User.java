package jpa.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "USER")
@Data
public class User implements Serializable {

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="USER_ID", unique = true, nullable = false)
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
    @JoinColumn(name="ADDRESS", referencedColumnName = "ID")
    private Address address;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<ContactInfo> contactInfos;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<RolePerUser> roles;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<UserToGame> games;

    //CONSTRUCTOR
    public User(){
        roles = new HashSet<>();
        contactInfos = new HashSet<>();
        games = new HashSet<>();
    }

}
