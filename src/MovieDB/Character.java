package MovieDB;


import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Character implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    private long id;

    private String name;
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Actor actor;

    private boolean protagonist;

    public Character(){
    }

    public Character(String name, Actor actor, boolean protagonist) {
        this.name = name;
        this.actor = actor;
        this.protagonist = protagonist;
    }

    public String getName() {
        return name;
    }

    public Actor getActor() {
        return actor;
    }

    public boolean isProtagonist() {
        return protagonist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return protagonist == character.protagonist && name.equals(character.name) && actor.equals(character.actor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, actor, protagonist);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", actor=" + actor +
                ", protagonist=" + protagonist +
                '}';
    }
}