import jdk.dynalink.beans.StaticClass;

public class Student {
    private static String name = "John";
    private static String classes = "CO2";

    public Student() {
    }

    public static String getName() {
        return name;
    }

    public static String getClasses() {
        return classes;
    }

    void display() {
        System.out.println(name + "" + classes + "");
    }
}
