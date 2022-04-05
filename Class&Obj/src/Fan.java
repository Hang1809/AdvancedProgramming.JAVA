public class Fan {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("blue");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("white");
        fan2.setOn(false);
        System.out.println(fan2.toString());

    }

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public  Fan() {
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        if(this.on) {
            return "Fan is on { speed: " + speed + ", color: " + color + ", radius: " + radius + " }";
        } else {
            return "Fan is off { color: " + color + ", radius: " + radius + " }";
        }
    }
}
