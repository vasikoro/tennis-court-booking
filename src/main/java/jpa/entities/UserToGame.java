package jpa.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="USER_TO_GAME")
@Data
public class UserToGame  implements Serializable {

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID" , unique = true, nullable = false)
    private  Long id;

    @ManyToOne
    @JoinColumn(name="USER", referencedColumnName = "USER_ID", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name="GAME", referencedColumnName = "ID")
    private Game game;

}
