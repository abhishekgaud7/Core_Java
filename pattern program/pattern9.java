public class pattern9 {
    public static void main(String[] args) {
        int n = 7;
        int nsp = n / 2;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        
        if (i <= n / 2) {
            nst += 2;
            nsp--;
        } else {
            nst -= 2;
            nsp++;
        }
    }
    }
}
