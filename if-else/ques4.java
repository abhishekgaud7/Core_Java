import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int sum =a+b+c;
    if(sum==180){
        System.out.println("VALID TRIANGLE");
    }else{
        System.out.println("NOTVALID TRIANGLE");
    }
    }
}
