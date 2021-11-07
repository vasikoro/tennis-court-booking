package jpa.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ROLE_PER_USER")
@Data
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

}
