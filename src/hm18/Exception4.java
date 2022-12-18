package hm18;

import java.util.Scanner;

public class Exception4 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e) {
            System.out.println("Wrong format");
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        finally {
            System.out.println("Program end");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
