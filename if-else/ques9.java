import java .util.*;
public class ques9 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a==b && b==c && c==a){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
}
}
