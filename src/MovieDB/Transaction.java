package MovieDB;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
public class Transaction implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    private long id;

    private String transactionDate;
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Movie movie;
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Client client;
    private String format;
    private int price;
    private String expireDate;

    public Transaction(){
    }

    public Transaction(String transactionDate, Movie movie, String format, int price, String expireDate) {
        this.transactionDate = transactionDate;
        this.movie = movie;
        this.format = format;
        this.price = price;
        this.expireDate = expireDate;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getFormat() {
        return format;
    }

    public int getPrice() {
        return price;
    }

    public String getExpireDate() {
        return expireDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionDate='" + transactionDate + '\'' +
                ", movie=" + movie +
                ", format='" + format + '\'' +
                ", price=" + price +
                ", expireDate='" + expireDate + '\'' +
                '}';
    }
}