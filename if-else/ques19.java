import java.util.*;
public class ques19 {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int BS= sc.nextInt();
	if(BS<=10000){
	    System.out.println(2*BS);
	}else if(BS<=20000){
	    System.out.println(2.15*BS);
	}else if(BS>20000){
	    System.out.println(2.25*BS);
	}
	}
}
