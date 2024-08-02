public class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nst; j++) {
                if (j == 1 || j == nst || i == n) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            nst += 2;
        }
    }
}
