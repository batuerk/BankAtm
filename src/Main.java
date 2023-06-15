import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<User1> userList = new ArrayList<>();
        User1 user1 = new User1(1,"11111111","luis","lane",2000,"123456788","987654320","0000011111");
        User1 user2 = new User1(2,"22222222","clark","kent",1000,"123456789","987654321","1111100000");
        userList.add(user1);
        userList.add(user2);
        Operation operation = new Operation(userList);
        operation.accountDetails(1);
        operation.accountDetails(2);

        operation.sendMoney(1, 500);

        operation.withdrawMoney(2, 500);

        operation.changePass(1, "newPass123");

        operation.accountDetails(1);
        operation.accountDetails(2);


    }
}