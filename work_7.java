// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class work_7 {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(8);
        listNumbers.add(13);
        listNumbers.add(2);
        listNumbers.add(2);
        listNumbers.add(11);
        listNumbers.add(5);
        listNumbers.add(2);
        listNumbers.add(2);
        listNumbers.add(4);
        System.out.println(Collections.max(listNumbers));
        System.out.println(Collections.min(listNumbers));
        System.out.println(getMiddleNumber(listNumbers));
    }

    static int getMiddleNumber(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }
}
