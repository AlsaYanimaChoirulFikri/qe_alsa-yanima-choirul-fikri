public class TugasNo1Part2 {
    public static void main(String[] args) {
        int squareArea = TugasNo1.getSquareArea(12);
        int rectangleArea = TugasNo1.getRectangleArea(7, 8);
        double circleArea = TugasNo1.getCircleArea(21);
        double trapezoidArea = TugasNo1.getTrapezoidArea(5, 6, 2);

        System.out.println("luas persegi: " + squareArea);
        System.out.println("luas persegi panjang: " + rectangleArea);
        System.out.println("luas lingkaran: " + String.format("%.2f", circleArea));
        System.out.println("luas trapesium: " + trapezoidArea);
    }
}
