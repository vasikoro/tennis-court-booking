package jpa.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ROLE")
public class Role implements Serializable {

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ROLE_ID", unique = true, nullable = false)
    private Long roleId;

    @Column(name="TYPE", nullable = false)
    private String type;

    //CONSTRUCTOR
    public Role() {}

    //GETTERS - SETTERS
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", type='" + type + '\'' +
                '}';
    }
}
