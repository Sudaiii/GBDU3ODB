package MovieDB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

@Entity
public class Director implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    private long id;

    private String name;

    public Director(){
    }

    public Director(String title) {
        this.name = title;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + name + '\'' +
                '}';
    }
}