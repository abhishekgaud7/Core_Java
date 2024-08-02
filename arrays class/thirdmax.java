public class thirdmax {
    public static void main(String[] args) {
        int[]arr={10,30,40,20,3300,4020,240};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
          if(max<arr[i]){
                 smax=max;
                  max=arr[i];  
           }else if(smax<arr[i]){
                   tmax=smax;
                    smax=arr[i];
                }else if(tmax<arr[i]){                
                    smax=arr[i];
                }else if(tmax<arr[i]){
                    tmax=arr[i];
                }

            
            
            System.out.println(tmax);
        }
    }
}