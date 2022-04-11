import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint newMovablePoint = new MovablePoint(2, 4, 5, 10);
        System.out.println(Arrays.toString(newMovablePoint.getXY()));
        System.out.println(newMovablePoint);
        newMovablePoint.move();
        System.out.println(Arrays.toString(newMovablePoint.getXY()));
    }
}

