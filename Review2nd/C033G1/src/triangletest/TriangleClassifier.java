package triangletest;

public class TriangleClassifier {
    public class Triangle {
        public static String TypeOfTriangle(double side1, double side2, double side3) {
            boolean isTriangle =
                    side1 > 0 && side2 > 0 && side3 > 0
                            && side1 + side2 > side3
                            && side1 + side3 > side2
                            && side2 + side3 > side1;
            if (!isTriangle) return "not Triangle";
            boolean isEquilateralTriangle = side1 == side2 && side2 == side3;
            boolean isIsoscelesTriangle = side1 == side2 || side2 == side3 || side1 == side3;
            boolean isRightTriangle = side1 * side1 + side2 * side2 == side3 * side3 ||
                    side2 * side2 + side3 * side3 == side1 * side1 ||
                    side1 * side1 + side3 * side3 == side2 * side2;

            if (isEquilateralTriangle) return "Equilateral Triangle";
            if (isIsoscelesTriangle) {
                if (isRightTriangle) return "Isosceles Right Triangle";
                else return "Isosceles Triangle";
            }
            if (isRightTriangle) return "Right Triangle";
            return "Normal Triangle";

        }
    }
}
