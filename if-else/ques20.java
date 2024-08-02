import java.util.*; 
public class ques20{
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	    int p =sc.nextInt();
	    int q =sc.nextInt();
	    
	if( q>100){
	    int bill =(90*p*q)/100;
	    
	    System.out.println(bill);
	} else{
	    int bill =q*p;
	    System.out.println(bill);
	}   
		
	}
}