// import java.util.*;
public class secondmin {
    public static void main(String[] args) {
        int[]arr={10,30,40,20,3300,4020,240};
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
             smin=min;
              min=arr[i];  
            }else if(smin>arr[i]){
                smin=arr[i];
            }
        }
        // Arrays.sort(arr);
        System.out.println(smin);
        // System.out.println(Arrays.toString(arr));
    }
}
