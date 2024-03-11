import java.util.Scanner;

public class TugasEksplorasi{

    public static String toCamelCase(String input) {
        StringBuilder camelCase = new StringBuilder();
        boolean kapital = false;

        for (char c : input.toCharArray()) {
            if (c == ' ') {
                kapital = true;
            } else {
                if (kapital) {
                    camelCase.append(Character.toUpperCase(c));
                    kapital = false;
                } else {
                    if (camelCase.length() == 0) {
                        camelCase.append(Character.toLowerCase(c));
                    } else {
                        camelCase.append(c);
                    }
                }
            }
        }

        return camelCase.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kalimat: ");
        String input = scanner.nextLine();

        String outputCamelCase = toCamelCase(input);
        System.out.println(outputCamelCase);
    }
}
