import java.util.*;
   public class ques15{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);    
	char status = sc.next().charAt(0);
	char gender = sc.next().charAt(0);
	int age = sc.nextInt();
	if (status=='M'||status=='m'){
	    System.out.println("hired");
	}else if((gender=='m'||gender=='M')&& age>30){
	    
	    System.out.println("hired");
	}else if((gender=='f'||gender=='F')&& age>25){
	    System.out.println("hired");
	}else{
	    System.out.println("not hired");
	}
	}

    
}
