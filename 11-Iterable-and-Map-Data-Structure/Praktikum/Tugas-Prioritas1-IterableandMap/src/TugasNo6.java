public class TugasNo6 {

    public static int sumArray(int k, int[] arr) {
        int maxSum = 0, winSum = 0;
        int winStart = 0;

        for (int winEnd = 0; winEnd < arr.length; winEnd++) {
            winSum += arr[winEnd];

            if (winEnd >= k - 1) {
                maxSum = Math.max(maxSum, winSum);
                winSum -= arr[winStart];
                winStart++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] input1 = {4, 5, 2, 1, 2, 1};
        int result1 = sumArray(3, input1);
        System.out.println("Input: " + java.util.Arrays.toString(input1));
        System.out.println("Output: " + result1);

        int[] input2 = {3, 2, 1, 1};
        int result2 = sumArray(2, input2);
        System.out.println("Input: " + java.util.Arrays.toString(input2));
        System.out.println("Output: " + result2);
    }
}

