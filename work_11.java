// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.LinkedList;
import java.util.ListIterator;

public class work_11 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedNums = new LinkedList<>();
        linkedNums.add(1);
        linkedNums.add(3);
        linkedNums.add(2);
        linkedNums.add(4);
        linkedNums.add(4);
        linkedNums.add(5);
        linkedNums.add(5);
        int sum = 0;
        ListIterator<Integer> iterator = linkedNums.listIterator(0);
        while(iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.println(sum);
        System.out.println(linkedNums);
    }
}
