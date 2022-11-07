package hm2;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String[] arr = {"Hello", ", ","World", "!"};
        System.out.println(Arrays.toString(arr));
        String buff;
        int len = arr.length - 1;
        for (int i=len; i>0; i--){
            buff = arr[len-i];
            arr[len-i] = arr[i];
            arr[i] = buff;
        }
        System.out.println(Arrays.toString(arr));
    }
}
