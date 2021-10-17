package jpa.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="USER_TO_GAME")
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

    //CONSTRUCTORS

    public UserToGame() {
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

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "UserToGame{" +
                "id=" + id +
                ", user=" + user +
                ", game=" + game +
                '}';
    }
}
