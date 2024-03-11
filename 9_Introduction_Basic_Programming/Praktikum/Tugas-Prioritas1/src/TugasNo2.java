import java.util.Scanner;

public class TugasNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input panjang
        System.out.print("Panjang: ");
        int panjang = scanner.nextInt();

        // input lebar
        System.out.print("Lebar: ");
        int lebar = scanner.nextInt();

        // menghitung luas
        int luas = panjang * lebar;

        // luasnya genap atau ganjil
        if (luas % 2 == 0) {
            System.out.println("Luas = " +luas+ " ---> Luas Genap");
        } else {
            System.out.println("Luas = " +luas+ " ---> Luas Ganjil");
        }
    }
}
