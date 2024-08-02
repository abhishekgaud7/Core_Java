public class Usingoperatortriangle {
    public static void main(String[] args) {
        int a=7;
        int b=17;
        int c=7;
        if(a==b && b==c){
            System.out.println("EQUILATERAL");
        }else if(a==b||b==c||c==a){
            System.out.println("ISO");
        }else{
            System.out.println("SCALENE");
        }
        }
    }
