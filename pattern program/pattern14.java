public class pattern14 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        int nsp = 2 * n - 3;
        for (int i = 1; i <= 2 * n - 1; i++) {
            // for stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("*\t");
            }
            // for spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            // for stars
            for (int j = 1; j <= nst; j++) {
                if (i == n && j == 2) {
                    j++;
                }
                System.out.print("*\t");
            }
            if (i < n) {
                nst++;
                nsp -= 2;
            } else {
                nst--;
                nsp += 2;
            }
            System.out.println();
        }
    }
}
