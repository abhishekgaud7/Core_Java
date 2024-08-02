import java.util.*;
public class AddTwoArrays {
    public static void main(String[] args) {
        int[]arr1={2,1,3,9,5};
        int[]arr2={7,1,3,4,2,0,6,5};
        int[]res=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            res[i]=arr1[i];

        }
        for(int i=0;i<arr2.length;i++){
            res[arr1.length+i]=arr2[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
