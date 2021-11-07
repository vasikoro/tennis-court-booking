package jpa.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="CONTACT_INFO")
@Data
public class ContactInfo implements Serializable {

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID" , unique = true, nullable = false)
    private  Long id;

    @Column(name="EMAIL", nullable = false)
    private String email;

    @Column(name="PHONE", nullable = false)
    private String telephone;

    @ManyToOne
    @JoinColumn(name = "COURT", referencedColumnName = "COURT_ID")
    private Court court;

    @ManyToOne
    @JoinColumn(name = "USER", referencedColumnName = "USER_ID")
    private User user;

}
