public class differenceBetweenMaxandMin {
    public static void main(String[] args) {
        int[]arr={10,30,40,20,3300,4020,02400};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
              max=arr[i];  
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        int diff =max-min;
        System.out.println(diff);
    }
    }
