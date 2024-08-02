import java.util.*;
public class RemoveElement {
    public static void main(String[] args) {
        int[]arr={4,5,3,1,7,0};
        int k = 7;
        int[]res=new int[arr.length-1];
        int itr = 0;
        for(int i = 0;i<arr.length;i++){
            if(k!=arr[i]){
                res[itr]=arr[i];
                itr++;
            }
        }
        System.out.println(Arrays.toString(res));
      }
}
