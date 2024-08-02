public class armstrong {
    public static void main(String[] args) {
        int n = 153;
        int og = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum = sum + digit * digit * digit;
        }
        if (sum == og) {
            System.out.println("THIS IS ARMSTRONG NUMBER");
        } else {
            System.out.println("THIS IS NOT ARMSTRONG NUMBER");
        }

    }
}