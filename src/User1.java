import java.util.ArrayList;
import java.util.List;
public class User1 {
    int userId;
    String tcNo;
    String name;
    String surname;
    int accountAmount;
    String accountNo;
    String accountPass;
    String cardNo;

    public User1(int userId, String tcNo, String name, String surname, int accountAmount, String accountNo, String accountPass, String cardNo) {
        this.userId = userId;
        this.tcNo = tcNo;
        this.name = name;
        this.surname = surname;
        this.accountAmount = accountAmount;
        this.accountNo = accountNo;
        this.accountPass = accountPass;
        this.cardNo = cardNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(int accountAmount) {
        this.accountAmount = accountAmount;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountPass() {
        return accountPass;
    }

    public void setAccountPass(String accountPass) {
        this.accountPass = accountPass;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "User1{" +
                "userId=" + userId +
                ", tcNo='" + tcNo + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", accountAmount=" + accountAmount +
                ", accountNo='" + accountNo + '\'' +
                ", accountPass='" + accountPass + '\'' +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }
}
