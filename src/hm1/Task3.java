package hm1;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i=0; i<10; i++){
            sum += arr[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое значение элементов массива: " + sum / arr.length);
    }
}
