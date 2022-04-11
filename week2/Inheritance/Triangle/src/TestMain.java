import java.util.Scanner;
public class TestMain {
    public static void main(String[] args) {
        double side1,side2,side3;
        String color;
        boolean filled;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap do dai ba canh tam giac: ");
        side1 = Double.parseDouble(scanner.nextLine());
        side2 = Double.parseDouble(scanner.nextLine());
        side3 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap mau sac: ");
        color = scanner.nextLine();
        System.out.print("To mau cho tam giac ( true / false)? ");
        filled = scanner.nextBoolean();
        Triangle triangle = new Triangle(color,filled,side1,side2,side3);
        System.out.println("Dien Tich: " + triangle.getArea());
        System.out.println("Chu vi: " + triangle.getPerimeter());
        System.out.println(triangle);

    }
}
