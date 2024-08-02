import java.util.*;
public class ques6 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a == b) {
        if (b == c) {
            System.out.println("Equilateral");
        } else {
            System.out.println("ISO");
        }
    } else if (b == c) {
        System.out.println("ISO");
    } else if (a == c) {
        System.out.println("ISO");
    } else {
        System.out.println("SCALENE");
    }
}
}