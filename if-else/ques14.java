import java.util.*;
public class ques14 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    char ch=sc.next().charAt(0);
    if((ch>='a' && ch<='z') || (ch>='A'&& ch<='Z')){
        System.out.println(ch + "  is a alphabet ");
    }else{
        System.out.println(ch + " not is a  alphabet ");
    }
}
}
