public class pattern4 {
        public static void main(String[] args) {
            int n = 5;
            int count =1;
            for (int i = 1; i <= n; i++) { // number of rows
                for (int j = 1; j <= i; j++) {
                    System.out.print(count + "\t");
                    if(count == 1){
                        count =0;
                    }else {
                        count = 1;
                    }
                }
                System.out.println();
            }
        }
    
    }