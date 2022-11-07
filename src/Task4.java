import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int p = 0;
        System.out.println("Введите 10 целых чисел: ");
        int sum = 0;
        do{
            if (sc.hasNextInt()){
                arr[p] = sc.nextInt();
                sum += arr[p];
            }
            else{
                System.out.println("Введено не целое число!");
                System.exit(0);
            }
            p++;
        }while (p < 10);
        int min = arr[0];
        p = 0;
        while (p < 10){
           if(min > arr[p]){
               min = arr[p];
           }
           p++;
        }
        int max = arr[0];
        p = 0;
        while (p < 10){
            if(max < arr[p]){
                max = arr[p];
            }
            p++;
        }
        System.out.println("Сумма чисел массива: " + sum);
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }
}
