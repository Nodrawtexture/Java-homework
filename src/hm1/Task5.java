package hm1;

public class Task5 {
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Нет аргументов для вывода (пожалуйста введите аргументы)");
        }
        else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент №" + (i + 1) + ": " + args[i]);
            }
        }
    }
}
