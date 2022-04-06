package AccessModifierCircle;

class Circle {
    private static double radius = 1.0;
    private static String color = "red";

    public Circle() {
    }
//
//    public Circle(double radius, String color) {
//        this.radius = radius;
//        this.color = color;
//    }

    public static double getRadius() {

        return radius;
    }

    public static String getColor() {

        return color;
    }

    public static double getArea() {

        return (radius * radius * Math.PI);
    }

}
