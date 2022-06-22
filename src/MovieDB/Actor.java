package MovieDB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;


@Entity
public class Actor implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    private long id;

    private String name;
    private String birthday;
    private String birthplace;

    public Actor(){
    }

    public Actor(String title, String date, String description) {
        this.name = title;
        this.birthday = date;
        this.birthplace = description;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return id == actor.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + name + '\'' +
                ", date='" + birthday + '\'' +
                ", description='" + birthplace + '\'' +
                '}';
    }
}