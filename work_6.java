// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;

public class work_6 {
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
        System.out.println(listNumbers);
        delEvenNumbers(listNumbers);
        System.out.println(listNumbers);
    }

    static void delEvenNumbers(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)% 2 == 0){
                list.remove(i);
                i--;
            }
        }
    }
}
