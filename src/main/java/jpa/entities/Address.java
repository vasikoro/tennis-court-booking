package jpa.entities;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ADDRESS")
@Data
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

}
