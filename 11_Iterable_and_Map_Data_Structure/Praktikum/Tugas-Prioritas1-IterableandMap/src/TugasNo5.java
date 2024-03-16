public class TugasNo5 {

    public static int duplicates(int[] arr) {
        int nonDuplicate = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[nonDuplicate - 1] != arr[i]) {
                arr[nonDuplicate] = arr[i];
                nonDuplicate++;
            }
        }
        return nonDuplicate;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 2, 3, 4, 5, 5};
        System.out.println("Input: " + java.util.Arrays.toString(array1));
        int length1 = duplicates(array1);
        System.out.println("Output: " + length1);

        int[] array2 = {2, 5, 6, 6, 6};
        System.out.println("\nInput: " + java.util.Arrays.toString(array2));
        int length2 = duplicates(array2);
        System.out.println("Output: " + length2);
    }
}
