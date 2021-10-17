package jpa.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="COURT")
public class Court implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @cO
    private  Long courtId;

    private String courtName;

    private Integer courtNumber;

    private String courtType;

    @OneToMany
    private
}
