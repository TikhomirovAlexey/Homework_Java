// Вычислить n-ое число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;


public class work_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int userNumber = scan.nextInt();
        scan.close();
        int sum = 0;
        int multi = 1;
        for (int i = 1; i <= userNumber; i++) {
            sum += i;
        }
        for (int j = 2; j <= userNumber; j++) {
            multi *= j;
        }
        System.out.printf("сумма чисел до %d равна %d\n", userNumber, sum);
        System.out.printf("произведение чисел до %d равна %d\n", userNumber, multi);
    }
}
