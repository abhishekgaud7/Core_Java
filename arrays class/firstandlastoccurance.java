public class firstandlastoccurance {
    public static void main(String[] args) {
        int[]arr={10,20,40,20,70,20,20};
        int k=70;
        int lo=-1;
        int fo=-1;
        boolean flag = true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k && flag==true){
            fo=i;
            flag=false;
        }
        
            if(arr[i]==k){
            lo=i;
        }
    }
        System.out.println(fo+ " " +lo);
       } 
}
