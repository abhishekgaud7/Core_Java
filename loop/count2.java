public class count2 {
    public static void main(String[] args) {
        int n = 563496349;
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }

}
