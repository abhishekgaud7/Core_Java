import java.util.*;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch>='A' && ch<='Z') {
            System.out.println("UPPERCASE");
        } else if (ch>='a' && ch<='z') {
            System.out.println("LOWERCASE");
        } else {
            System.out.println("INVALID");
        }
    }
}