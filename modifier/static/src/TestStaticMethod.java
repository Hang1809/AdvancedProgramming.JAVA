public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Ngan");
        Student s2 = new Student(222, "Thi");
        Student s3 = new Student(333, "Triet");
        Student s4 = new Student(444, "Ly");
        Student s5 = new Student(555, "Han");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}
