package jpa.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ROLE")
@Data
public class Role implements Serializable {

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ROLE_ID", unique = true, nullable = false)
    private Long roleId;

    @Column(name="TYPE", nullable = false)
    private String type;

}
