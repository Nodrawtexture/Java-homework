package hm2;

public class HowMany {
    public static void main(String[] args) {
        if (args.length > 0) {
        System.out.println("Вы ввели " + args.length + " слов(-а)");
        }
        else {
            System.out.println("Введите что-нибудь");
        }
    }
}
