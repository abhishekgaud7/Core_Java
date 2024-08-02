import java.util.*;

public class reverseinarray {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 2, 1, 3 };

        int[] res = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            res[arr.length - 1 - i] = arr[i];
        }
        System.out.println(Arrays.toString(res));

    }
}