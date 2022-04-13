package com.codegym;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        System.out.println("Dien tich hinh tron ban dau: " + ((Circle) shapes[0]).getArea());
        ((Circle) shapes[0]).resize(3);

        shapes[1] = new Rectangle(2, 4);
        System.out.println("Dien tich hinh chu nhat ban dau: " + ((Rectangle) shapes[1]).getArea());
        ((Rectangle) shapes[1]).resize(2);

        shapes[2] = new Square(4);
        System.out.println("Dien tich hinh vuong ban dau: " + ((Square) shapes[2]).getArea());
        ((Square) shapes[2]).resize(4);

        for(Shape shape : shapes) {
            if(shape instanceof Circle){
                System.out.printf("Dien tich hinh tron sau khi tang kich thuoc:%.2f%n " , ((Circle) shape).getArea());
            }else if(shape instanceof Rectangle && !(shape instanceof Square)){
                System.out.printf("Dien tich hinh chu nhat sau khi tang kich thuoc:%.2f%n " , ((Rectangle) shape).getArea());
            }else {
                System.out.printf("Dien tich hinh vuong sau khi tang kich thuoc:%.2f%n " , ((Square) shape).getArea());
            }
        }

        Square mySquare = new Square(3);
        mySquare.howToColor();
    }
}
