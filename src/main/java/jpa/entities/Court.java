package jpa.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="COURT")
@Data
public class Court implements Serializable {

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="COURT_ID", unique = true, nullable = false)
    private  Long courtId;

    private String courtName;

    private Integer courtNumber;

    private String courtType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ADDRESS", referencedColumnName = "ID")
    private Address address;

    @OneToMany(mappedBy = "court", cascade = CascadeType.ALL)
    private Set<ContactInfo> contactInfos;

    public Court() {
        contactInfos = new HashSet<>();
    }


}
