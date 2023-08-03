// Реализовать простой калькулятор
import java.util.Scanner;

public class work_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите операцию: '+','-','/','*' - ");
        String option = scan.nextLine();
        System.out.println("Введите первое число: ");
        double number1 = scan.nextDouble();
        System.out.println("Введите второе число: ");
        double number2 = scan.nextDouble();
        scan.close();
        switch(option){
            case "+":
            System.out.println(sum(number1, number2));
            break;
            case "-":
            System.out.println(diff(number1, number2));
            break;
            case "/":
            System.out.println(divide(number1, number2));
            break;
            case "*":
            System.out.println(multi(number1, number2));
            break;
            default: System.out.println("Error!");
        }
    }

    static double sum(double num1, double num2){
        return num1 + num2;
    }
    static double diff(double num1, double num2){
        return num1 - num2;
    }
    static double divide(double num1, double num2){
        return num1 / num2;
    }
    static double multi(double num1, double num2){
        return num1 * num2;
    }
}
