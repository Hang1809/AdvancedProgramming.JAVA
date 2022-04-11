public class Circle {
    private double radius;
    private String color;

    public Circle(){

    }

    public  Circle(double radius,String color){
        this.color = color;
        if (radius >0){
            this.radius = radius;
        }
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius ;
    }
}
