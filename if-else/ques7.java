import java.util.*;
public class ques7 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);   
     int physics =sc.nextInt();
     int chemistry =sc.nextInt();
     int bio =sc.nextInt();
     int maths =sc.nextInt();
     int computer =sc.nextInt();
     int sum=physics+chemistry+bio+maths+computer;
		int percentage=sum/5;
		          if(percentage>90){
		              System.out.println(" grade A "  +  " CONGRATULATIONS YOU ARE A TOPPER ");
		          }else if(percentage>80) {
		              System.out.println("grade B");
	
                  }else if (percentage>70){
                      System.out.println("grade C");
                    }else if (percentage>60){
                        System.out.println("grade D");
                    }else if(percentage>50){
                          System.out.println("grade E");    
                      }else if (percentage>40){
                          System.out.println("grade F");
                      }
	}
}

