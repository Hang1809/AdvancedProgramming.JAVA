package studentlistbinary;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Huynh Phuong Ngan", "Hue"));
        students.add(new Student(2, "Thi Pham", "Hue"));
        students.add(new Student(3, "Triet Nguyen", "Hue"));
        students.add(new Student(4, "Tung Nguyen", "HN"));
        students.add(new Student(5, "Ly Ho", "HCM"));
        students.add(new Student(6, "Han Nguyen", "Hue"));
        writeToFile("student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }
    // writeToObject(String path, List<Student> students) để ghi danh sách học viên hiện có vào trong file nhị phân
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //lay danh sach hoc vien
    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }
}
