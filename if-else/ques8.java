import java.util.*;
public class ques8 {
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    double r =sc.nextDouble();
    double s =sc.nextDouble();
    double a =sc.nextDouble();
    if(r<s && r<a){
        System.out.println("RAM");
    }else if(s<r && s<a){
        System.out.println("SHYAM");
    }else{
        System.out.println("ABHI");
    }
}
}