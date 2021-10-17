package jpa.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="CONTACT_INFO")
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

    //CONSTRUCTORS
    public ContactInfo() {}

    //GETTERS - SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", court=" + court +
                ", user=" + user +
                '}';
    }
}
