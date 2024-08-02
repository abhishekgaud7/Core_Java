public class pattern7 {
    public static void main(String[] args) {
        int n = 7;
        for (int i= 1; i <= n; i++) {
            int ele = i; int diff =n;
            for (int j = 1; j <=i ; j++) {
                System.out.print(ele+ " ");
                diff--;
                ele =ele+diff;
            }
            System.out.println();
        }
    }
}
