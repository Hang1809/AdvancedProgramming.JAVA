public class Circle {
    private double radius;
    private String color;
    private boolean filled = true;

    public Circle(){}

    public Circle(double radius, String color, boolean filled){
        this.color = color;
        if (radius>0){
            this.radius = radius;
        }
        this.filled = filled;
    }

    public Circle(double radius) {
        if (radius>0){
            this.radius = radius;
        }
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
