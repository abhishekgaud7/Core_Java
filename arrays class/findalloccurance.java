public class findalloccurance {
    public static void main(String[] args) {
        int[]arr={10,30,60,70,80,60,60,60,};

        int k=60;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println(i);
            }
        }
    }
}
