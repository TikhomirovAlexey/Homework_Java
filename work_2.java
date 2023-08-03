// Вывести все простые числа от 1 до 1000

public class work_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int tmpCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) tmpCount++;
                if (tmpCount > 2) break;
            }
            if (tmpCount == 2) System.out.println(i);
        }
    }
}
