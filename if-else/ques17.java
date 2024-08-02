import java.util.*;

public class ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hardnes = sc.nextInt();
        double carbon = sc.nextDouble();
        int tensile = sc.nextInt();
        if (hardnes > 50 && carbon < 0.7 && tensile > 5600) {
            System.out.println("Grade is 10");
        } else if (hardnes > 50 && carbon < 0.7) {
            System.out.println("Grade is 9");
        } else if (carbon < 0.7 && tensile > 5600) {
            System.out.println("Grade is 8");
        } else if (hardnes > 50 && tensile > 5600) {
            System.out.println("Grade is 7");
        } else if (hardnes > 50) {
            System.out.println("Grade is 6");
        } else {
            System.out.println("Grade is 5");
        }
    }
}