import java.util.*;
public class ques12 {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int month=sc.nextInt();
    int year=sc.nextInt();
    if(month==1 || month==3|| month==5|| month==7|| month==8|| month==10|| month==12){
        System.out.println("31 DAYS");
    }else if(month==4 || month==6 || month==9 || month==11){
        System.out.println("30 DAYS");
    }else if(month==2 && year%4==0){
        System.out.println("29 DAYS");
    }else if(month==2){
        System.out.println("28 DAYS");
    }
}
}