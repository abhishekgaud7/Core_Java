public class pattern20 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j || i+j==n+1){
                System.out.print("*\t");
            }else{
            System.out.print("\t");
        }
    }
    System.out.println();
    }
}
}
