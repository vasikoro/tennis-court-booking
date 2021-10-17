package jpa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="GAME")
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

    //CONSTRUCTORS

    public Game() {
        this.userToGameSet = new HashSet<>();
    }

    //GETTERS - SETTERS

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public LocalDateTime getGameDate() {
        return gameDate;
    }

    public void setGameDate(LocalDateTime gameDate) {
        this.gameDate = gameDate;
    }

    public String getHasPlayed() {
        return hasPlayed;
    }

    public void setHasPlayed(String hasPlayed) {
        this.hasPlayed = hasPlayed;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public Set<UserToGame> getUserToGameSet() {
        return userToGameSet;
    }

    public void setUserToGameSet(Set<UserToGame> userToGameSet) {
        this.userToGameSet = userToGameSet;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", gameDate=" + gameDate +
                ", hasPlayed='" + hasPlayed + '\'' +
                ", duration='" + duration + '\'' +
                ", court=" + court +
                '}';
    }
}
