package jpa.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ROLE_PER_USER")
public class RolePerUser implements Serializable {

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID", unique = true, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name="USER", referencedColumnName = "USER_ID", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name="ROLE", referencedColumnName = "ROLE_ID")
    private Role role;

    //CONSTRUCTORS
    public RolePerUser() {
    }

    //GETTERS - SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "RolePerUser{" +
                "id=" + id +
                ", user=" + user +
                ", role=" + role +
                '}';
    }
}
