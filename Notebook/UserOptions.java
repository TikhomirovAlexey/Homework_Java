package Notebook;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserOptions {
    private Map<String, String> userOptions;

    UserOptions(){
        userOptions = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите критерии поиска через пробел:" +
        "\n 1 - Бренд" +
        "\n 2 - Название" +
        "\n 3 - Диагональ" +
        "\n 4 - Цвет" +
        "\n 5 - Оперативная память" +
        "\n 6 - Встроенная память ЖД" +
        "\n 7 - Операционная система");
        String[] userOption = scanner.nextLine().split(" ");
        for (int i = 0; i < userOption.length; i++) {
            switch(userOption[i]){
                case "1":
                System.out.println("Введите бренд: ");
                userOptions.put("brand", scanner.nextLine());
                break;
                case "2":
                System.out.println("Введите название: ");
                userOptions.put("name", scanner.nextLine());
                break;
                case "3":
                System.out.println("Введите минимальное значение диагонали: ");
                userOptions.put("diagonal", scanner.nextLine());
                break;
                case "4":
                System.out.println("Введите цвет: ");
                userOptions.put("color", scanner.nextLine());
                break;
                case "5":
                System.out.println("Введите минимальное значение оперативной памяти: ");
                userOptions.put("memoryRAM", scanner.nextLine());
                break;
                case "6":
                System.out.println("Введите минимальное значение встроенной памяти ЖД: ");
                userOptions.put("memoryHDD", scanner.nextLine());
                break;
                case "7":
                System.out.println("Введите требуемую операционнцю систему: ");
                userOptions.put("operatingSystem", scanner.nextLine());
                break;
            }
        }
        scanner.close();  
    }

    public Map<String, String> getUserOptions() {
        return userOptions;
    }

    public String toString(){
        String tmpString = "";
        for (var element : userOptions.entrySet()) {
            tmpString += element.getKey() + " : " + element.getValue() + "\n";
        }
        return tmpString;
    }
}
