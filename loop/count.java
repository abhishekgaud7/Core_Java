public class count {
    public static void main(String[] args) {
        int n =67858;
        int count = 0;
        int Sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            count++;
            Sum = Sum + digit;
        }
        System.out.println(count);
    }
}
