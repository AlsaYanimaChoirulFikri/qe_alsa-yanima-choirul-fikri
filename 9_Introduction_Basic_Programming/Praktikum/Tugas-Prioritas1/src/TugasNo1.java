import java.util.Scanner;

public class TugasNo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input berat
        System.out.print("Berat (kg): ");
        double berat = scanner.nextDouble();

        // input jarak
        System.out.print("Jarak (km): ");
        double jarak = scanner.nextDouble();

        // biaya berdasarkan berat
        int biayaBerat;
        if (berat < 2) {
            biayaBerat = 10000;
        } else if (berat <= 7) {
            biayaBerat = 15000;
        } else if (berat <= 15) {
            biayaBerat = 25000;
        } else {
            biayaBerat = 40000;
        }

        // biaya berdasarkan jarak
        int biayaJarak;
        if (jarak < 1) {
            biayaJarak = 2000;
        } else if (jarak <= 7) {
            biayaJarak = 5000;
        } else if (jarak <= 15) {
            biayaJarak = 10000;
        } else {
            biayaJarak = 20000;
        }

        // total biaya
        int biayaTotal = biayaBerat + biayaJarak;

        // menampilkan hasil
        System.out.println("Biaya Total: Rp " + biayaTotal);
    }
}

