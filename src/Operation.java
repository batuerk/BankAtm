import java.util.ArrayList;
import java.util.List;

public class Operation {
    public List<User1> userList = new ArrayList<>();

    public Operation(List<User1> userList) {
        this.userList = userList;
    }

    public void accountDetails(int userId) {
        for (User1 user1: userList) {
            if (user1.getUserId() == userId) {
                System.out.println("User Details: "+ user1.toString());
            }
        }
    }
    public void sendMoney(int userId, int amount){
        for (User1 user1: userList) {
            if (user1.getUserId() == userId) {
                int newAmount = user1.getAccountAmount() + amount;
                user1.setAccountAmount(newAmount);
                System.out.println("Update Amount: " + newAmount);
            }
        }
    }
    public void withdrawMoney(int userId, int amount) {
        for (User1 user : userList) {
            if (user.getUserId() == userId) {
                int newAmount = user.getAccountAmount() - amount;
                if (newAmount >= 0) {
                    user.setAccountAmount(newAmount);
                    System.out.println("Updated Account Balance: " + newAmount);
                } else {
                    System.out.println("Insufficient balance.");
                }
                break;
            }
        }
    }
    public void showAmount(int userId, int amount){
        System.out.println("hesap bakiyesi görüntülendi");

    }
    public void changePass(int userId, String newPassword){
        System.out.println("şifre değiştirildi");

    }
    public void showAccountInfo(int userId, String accountNo, String cardNo){
        System.out.println("hesap bilgileri görüntülendi");

    }
}
