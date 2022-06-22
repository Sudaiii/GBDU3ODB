package MovieDB;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;


@Entity
public class Client implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String email;

    private String name;
    private String country;
    @OneToMany(orphanRemoval = true)
    private ArrayList<Card> cards;

    public Client(){
    }

    public Client(String email, String name, String country, ArrayList<Card> cards) {
        this.email = email;
        this.name = name;
        this.country = country;
        this.cards = cards;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "Client{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", cards=" + cards +
                '}';
    }
}