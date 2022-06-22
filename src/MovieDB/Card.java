package MovieDB;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

@Entity
public class Card implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String number;

    private String expireDate;
    private String verificationCode;
    private float balance;

    public Card(){
    }

    public Card(String text, String expireDate, String verificationCode, float balance) {
        this.number = text;
        this.expireDate = expireDate;
        this.verificationCode = verificationCode;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public float getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "text='" + number + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", verificationCode='" + verificationCode + '\'' +
                ", balance=" + balance +
                '}';
    }
}