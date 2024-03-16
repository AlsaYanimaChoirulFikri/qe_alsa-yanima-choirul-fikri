import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class TugasNo4 {

    public static List<Integer> findUnique(int[] firstArray, int[] secondArray) {
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        for (int num : secondArray) {
            secondSet.add(num);
        }

        for (int num : firstArray) {
            if (!secondSet.contains(num)) {
                uniqueSet.add(num);
            }
        }

        return new ArrayList<>(uniqueSet);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 4, 6, 8, 10};
        System.out.println("Input 1: " + Arrays.toString(array1) + " dan " + Arrays.toString(array2));

        List<Integer> output = findUnique(array1, array2);
        System.out.println("Output 1: " + Arrays.toString(output.toArray()));

        int[] array3 = {4, 7, 8};
        int[] array4 = {4, 6, 8};
        System.out.println("Input 2: " + Arrays.toString(array3) + " dan " + Arrays.toString(array4));

        output = findUnique(array3, array4);
        System.out.println("Output 2: " + Arrays.toString(output.toArray()));
    }
}

