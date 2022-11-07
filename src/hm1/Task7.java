package hm1;

import java.util.Scanner;

public class Task7 {

    public static long fact(int n){
        long  f = 1;
        for (int i=1; i<=n; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последнее число факториала: ");
        if (sc.hasNextInt()){
            int f = sc.nextInt();
            System.out.print(f + "! = " + fact(f));
        }
        else{
            System.exit(0);
        }
    }
}
