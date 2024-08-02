    public class firstandlast {
        public static void main(String[] args) {
            int []arr ={10,20,30,40,30,30,20,30};
            int k=10;
        
            int lo=-1;
            // last occurence
            int fo=-1;
            // first occurence
            for(int i=0;i<arr.length;i++){
                if(arr[i]==k){
                    lo=i;
                 System.out.println(lo);
                }
            }
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]==k){
                    fo=i;
                System.out.println(fo);
                }
            }
}
    }