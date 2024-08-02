public class minimum {
    public static void main(String[] args) {
        int[]arr={10,30,40,20,3300,4020,02400};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
              min=arr[i];  
            }
        }
        System.out.println(min);
    }
}