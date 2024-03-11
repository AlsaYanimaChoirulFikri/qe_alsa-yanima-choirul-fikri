import java.util.Scanner;

public class TugasNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kata: ");
        String input = scanner.nextLine();

        String konversi = input
                .replace("A", "4").replace("a", "4")
                .replace("E", "3").replace("e", "3")
                .replace("I", "1").replace("i", "1")
                .replace("O", "0").replace("o", "0");

        System.out.println(konversi);
    }
}
