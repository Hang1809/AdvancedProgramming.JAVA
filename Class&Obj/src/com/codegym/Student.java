package com.codegym;

public class Student {

    int id;
    String name;
    int age;
    String email;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    Student(int i, String n, String b) {
        id = i;
        name = n;
        email = b;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Student s1 = new Student(1, "Ngan");
        Student s2 = new Student(2, "Thy", 18);
        Student s3 = new Student(3, "Hang","hangdinh@gmail.com");
        s1.display();
        s2.display();
        s3.display();
    }
}
