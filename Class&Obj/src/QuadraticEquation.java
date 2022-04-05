import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String Getter() {
        return "a = " + a + " b = " + b + "c = " + c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        a = Double.parseDouble(scanner.nextLine());
        b = Double.parseDouble(scanner.nextLine());
        c = Double.parseDouble(scanner.nextLine());

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println("Detla: " + equation.getDiscriminant());

        if (equation.getDiscriminant() > 0) {
            System.out.println("Equation has 2 roots: ");
            System.out.println("x1 = " + equation.getRoot1());
            System.out.println("x2 = " + equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("Equation has 1 doulbe root: ");
            System.out.println("x1 = x2 = " + equation.getRoot1());
        } else {
            System.out.println("Equation has no real root!");
        }
    }
}

