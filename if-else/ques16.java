import java.util.*;
public class ques16 {
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
         int area = l*b;
        System.out.println(area);
         int perimeter = 2*(l+b);
         System.out.println(perimeter);
        
         if(area>perimeter){
             System.out.println("area is greater");
            
         }else {
            System.out.println("perimeter is greater");
         }
        
    }
    
}
