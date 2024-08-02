import java.util.*;
public class copyarray {
    public static void main(String[] args) {
        int[]arr={4,7,2,1,3};

        int[] res= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
        }
        System.out.println(Arrays.toString(res));

    }
}
