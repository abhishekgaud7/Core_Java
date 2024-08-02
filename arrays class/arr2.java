    public class arr2 {
        public static void main(String[] args) {
            int[]arr={10,20,30,50,68,89,189};
    
            int k=30;
    
            int idx=-1;
    
            for(int i=0; i<arr.length;i++){
                if(arr[i]==k){
                    idx=i;
                }
            }
            System.out.println(idx);
        }
}
