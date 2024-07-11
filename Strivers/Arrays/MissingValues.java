package Strivers.Arrays;
import java.util.*;

public class MissingValues {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2};
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1 && arr[i] <= arr.length) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
