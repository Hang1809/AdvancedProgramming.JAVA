public class Cylinder extends Circle {
    private double height =1 ;

    public Cylinder(double height){
        if (height>0){
            this.height = height;
        }
    }

    public Cylinder(double radius ,String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getCircleRadius(){
        return getRadius();
    }

    public double getVolume(){
        return this.height * getArea();
    }
}
