package hm2;

import java.lang.*;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ball b1 = new Ball();
        System.out.println("Исходные значения:\n\t" + b1.toString());
        System.out.println("Введите новую к-ту x:");
        b1.setX(sc.nextDouble());
        System.out.println("Новая координата x: " + b1.getX());
        System.out.println("Новые значения:\n\t" + b1.toString());
        System.out.println("Введите новую к-ту y:");
        b1.setY(sc.nextDouble());
        System.out.println("Новые значения:\n\t" + b1.toString());
        System.out.println("Введите новую к-ту x и y:");
        b1.setXY(sc.nextDouble(), sc.nextDouble());
        System.out.println("Новые значения:\n\t" + b1.toString());
        System.out.println("Введите значения xDisp и yDisp (x и y будут перемещены на xDisp и yDisp соответсвенно): ");
        b1.move(sc.nextDouble(), sc.nextDouble());
        System.out.println("Новые значения:\n\t" + b1.toString());
    }
}
