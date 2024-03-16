import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class TugasNo1 {

    public static void main(String[] args) {
        String[] array1 = {"Mudryk", "Chilwel", "Enzo"};
        String[] array2 = {"Caicedo", "Palmer"};

        String[] mergedArray = mergeArrays(array1, array2);
        System.out.println("Output: " + Arrays.toString(mergedArray));
    }

    public static String[] mergeArrays(String[] array1, String[] array2) {
        Set<String> set = new LinkedHashSet<>();

        // Add all elements from both arrays to the set
        set.addAll(Arrays.asList(array1));
        set.addAll(Arrays.asList(array2));

        // Convert the set back to an array
        String[] result = set.toArray(new String[0]);
        return result;
    }
}
