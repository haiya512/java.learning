import java.util.Scanner;
import java.util.Date;

public class Test {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("使用者名称:"); String username = scanner.next();
        System.out.print("使用者密码:"); String password = scanner.next();
        if("caterpillar".equals(username)
            && "1975".equals(password)) {
            System.out.println("秘密信息在此!"); }
        else { System.out.println(username +
            " 您好，输入的登录数据有误，请重新输入!");
        }
    }
}
