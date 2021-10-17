package jpa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="COURT")
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

    //GETTERS - SETTERS
    public Long getCourtId() {
        return courtId;
    }

    public void setCourtId(Long courtId) {
        this.courtId = courtId;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public Integer getCourtNumber() {
        return courtNumber;
    }

    public void setCourtNumber(Integer courtNumber) {
        this.courtNumber = courtNumber;
    }

    public String getCourtType() {
        return courtType;
    }

    public void setCourtType(String courtType) {
        this.courtType = courtType;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<ContactInfo> getContactInfos() {
        return contactInfos;
    }

    public void setContactInfos(Set<ContactInfo> contactInfos) {
        this.contactInfos = contactInfos;
    }

    @Override
    public String toString() {
        return "Court{" +
                "courtId=" + courtId +
                ", courtName='" + courtName + '\'' +
                ", courtNumber=" + courtNumber +
                ", courtType='" + courtType + '\'' +
                ", address=" + address +
                '}';
    }
}
