public class pattern0 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) { // number of rows
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

}
