import java.util.Arrays;

public class TugasNo3 {

    public static int[] findPair(int[] arr, int targetSum) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == targetSum) {
                return new int[] { left, right };
            }

            if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {}; // Pair not found
    }

    public static void main(String[] args) {
        int[] testArray1 = {1, 2, 3, 5, 8};
        int target1 = 8;
        System.out.println("Input 1: " + Arrays.toString(testArray1) + "\ntarget= " + target1);
        System.out.println("Output 1: " + Arrays.toString(findPair(testArray1, target1)));

        int[] testArray2 = {1, 5, 6, 7, 12};
        int target2 = 12;
        System.out.println("Input 2: " + Arrays.toString(testArray2) + "\ntarget= " + target2);
        System.out.println("Output 2: " + Arrays.toString(findPair(testArray2, target2)));
    }
}

