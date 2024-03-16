import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TugasNo2 {

    public static void main(String[] args) {
        String input1 = "7367356988";
        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Output: " + UniqueNumbers(input1));

        String input2 = "343545";
        System.out.println("Input: \"" + input2 + "\"");
        System.out.println("Output: " + UniqueNumbers(input2));
    }

    public static List<Integer> UniqueNumbers(String input) {
        Map<Character, Integer> freqMap = new HashMap<>();
        List<Integer> uniqueNumbers = new ArrayList<>();

        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumbers.add(Character.getNumericValue(entry.getKey()));
            }
        }

        return uniqueNumbers;
    }
}

