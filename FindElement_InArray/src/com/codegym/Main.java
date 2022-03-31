package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor",
                "Zachariah", "Mallory", "Zoe", "Emily"};

        //Khai báo biến lưu tên tìm kiếm và  gán với giá trị nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name of student:");
        String input_name = scanner.nextLine();

        //Duyet Mang & Tim phan tu
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
