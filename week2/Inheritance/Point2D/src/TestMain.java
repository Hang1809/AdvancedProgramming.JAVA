import java.util.Arrays;
public class TestMain {
    public static void main(String[] args) {
        Point3D firstPoint3D = new Point3D(2,4,6);
        System.out.println(firstPoint3D);
        System.out.println(Arrays.toString(firstPoint3D.getXYZ()));
        firstPoint3D.setXYZ(1,2,3);
        System.out.println(Arrays.toString(firstPoint3D.getXYZ()));
    }
}
