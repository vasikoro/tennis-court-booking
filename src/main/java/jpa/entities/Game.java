package jpa.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="GAME")
@Data
public class Game  implements Serializable {

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="GAME_ID" , unique = true, nullable = false)
    private  Long gameId;

    @Column(name="GAME_DATE")
    private LocalDateTime gameDate;

    @Column(name="HAS_PLAYED", length = 1)
    private String hasPlayed;

    @Column(name="DURATION")
    private String duration;

    @ManyToOne
    @JoinColumn(name="COURT", referencedColumnName = "COURT_ID")
    private Court court;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    private Set<UserToGame> userToGameSet;

}
