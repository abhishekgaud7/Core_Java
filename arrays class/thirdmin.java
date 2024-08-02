public class thirdmin {
    public static void main(String[] args) {
            int[]arr={1,30,4,2,3,4020,240};
            int min=Integer.MAX_VALUE;
            int smin=Integer.MAX_VALUE;
            int tmin=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(min>arr[i]){
                 smin=min;
                  min=arr[i];  
                }else if(smin>arr[i]){
                    smin=arr[i];
                }else if(tmin>arr[i]){
                    tmin=smin;
                    smin=arr[i];
                }else if(tmin>arr[i]){
                    tmin=arr[i];
                }

                }
            
            System.out.println(tmin);
        }
    }
