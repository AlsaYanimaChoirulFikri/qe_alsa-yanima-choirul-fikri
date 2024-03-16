public class TugasNo1 {
    // luas persegi
    public static int getSquareArea(int side) {
        return side * side;
    }

    // luas persegi panjang
    public static int getRectangleArea(int length, int width) {
        return length * width;
    }

    // luas lingkaran
    public static double getCircleArea(int radius) {
        return 3.14 * radius * radius;
    }

    // luas trapesium
    public static double getTrapezoidArea(int baseA, int baseB, int height) {
        return 0.5 * (baseA + baseB) * height;
    }
}
