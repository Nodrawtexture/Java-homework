package hm2;

import java.lang.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Author a1 = new Author("Mark", "mark@ggl.com", 'M');
        System.out.println("Имя: " + a1.getName());
        System.out.println("Email: " + a1.getEmail());
        System.out.println("Gender: " + a1.getGender());
        System.out.println("Все вместе:\n\t" + a1.toString());
        System.out.println("\nВведите новый email: ");
        a1.setEmail(sc.next());
        System.out.println("Новый email: " + a1.getEmail());
        System.out.println("Все вместе:\n\t" + a1.toString());
    }
}
