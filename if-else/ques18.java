import java.util.*;
public class ques18 {
    public static void name(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char ch = '+';
        if (ch == '+') {
            System.out.println(num1 + num2);
        } else if (ch == '-') {
            System.out.println(num1 - num2);
        } else if (ch == '*') {
            System.out.println(num1 * num2);
        } else if (ch == '/') {
            System.out.println(num1 / num2);
        }

    }

}
