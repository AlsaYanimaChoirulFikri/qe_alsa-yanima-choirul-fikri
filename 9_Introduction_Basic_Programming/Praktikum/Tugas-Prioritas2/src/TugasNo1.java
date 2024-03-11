import java.util.Scanner;

public class TugasNo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah angka: ");
        int jumlah = scanner.nextInt();

        System.out.print("Nilai n: ");
        int n = scanner.nextInt();

        System.out.println();
        int count = 0;
        int currentNumber = 1;

        while (count < jumlah) {
            if (currentNumber % n == 0) {
                System.out.println(currentNumber);
                count++;
            }
            currentNumber++;
        }
    }
}
