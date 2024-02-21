import java.util.Arrays;

public class EqualizeArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};

        if (arr1.length == arr2.length) {
            System.out.println("Arrays have equal length.");
        } else {
            int smallerLength = Math.min(arr1.length, arr2.length);

            int[] result = Arrays.copyOf(smallerLength > arr1.length ? arr2 : arr1, smallerLength);

            System.out.println("Arrays are adjusted to the smaller length: " + Arrays.toString(result));
        }
    }
}
