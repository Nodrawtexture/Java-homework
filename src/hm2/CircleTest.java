package hm2;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("Радиус первой окружности " + c1.getRadius());
        System.out.println("Радиус второй окружности " + c2.getRadius());
        System.out.println("\nВведите новый радиус первой окружности");
        c1.setRadius(sc.nextDouble());
        System.out.println("\nВведите новый радиус второй окружности");
        c2.setRadius(sc.nextDouble());
        System.out.println("\nРадиус первой окружности " + c1.getRadius());
        System.out.println("Длина первой окружности " + c1.Length());
        System.out.println("Площадь первой окружности " + c1.Surface());
        System.out.println("\nРадиус второй окружности " + c2.getRadius());
        System.out.println("Длина второй окружности " + c2.Length());
        System.out.println("Площадь второй окружности " + c2.Surface() + "\n");
        c1.Compare(c1.getRadius(), c2.getRadius());
    }
}
