public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private boolean isExist = true;

    public Triangle() {
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            isExist = true;
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            isExist = false;
            System.out.println("Đây không phải là 3 cạnh của 1 tam giác!");
        }
    }

    public void setSide(double side1, double side2,double side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            isExist = true;
            this.side1 = side1;
            this.side2 = side2;
            this.side3 =side3;
        }else {
            isExist = false;
            System.out.println("Đây không phải là 3 cạnh của 1 tam giác!");
        }
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        if(isExist){
            double p = getPerimeter() / 2;
            return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        }else return -1;
    }

    public double getPerimeter() {
        if(isExist){
            return side1 + side2 + side3;
        }else return -1;
    }

    @Override
    public String toString() {
        if(isExist){
            return "Triangle{color='" + getColor() + "', filled =" + isFilled() +
                    ", side1=" + side1 +
                    ", side2=" + side2 +
                    ", side3=" + side3 +
                    '}';
        }else {
            return "Không phải 1 tam giác hợp lệ!";
        }
    }

}
