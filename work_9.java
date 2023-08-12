// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список. 
// Постараться не обращаться к листу по индексам.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class work_9 {
    public static void main(String[] args) {
        LinkedList<Integer> listNumbers = new LinkedList<>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);
        listNumbers.add(5);
        listNumbers.add(6);
        listNumbers.add(7);
        int[] reverseList = new int[listNumbers.size()];
        getNewReverseList(listNumbers, reverseList);
        System.out.println(listNumbers);
        System.out.println(Arrays.toString(reverseList));
    }

    static void getNewReverseList(LinkedList<Integer> lstNum, int[] arr){
        ListIterator<Integer> iterator = lstNum.listIterator(lstNum.size());
        int i = 0;
        while(iterator.hasPrevious()){
            arr[i++] = iterator.previous();
        }
    }
}
