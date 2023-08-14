// Пусть дан список сотрудников: 
// Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, 
// Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class work_13 {
    public static void main(String[] args) {
        String text = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] arrName = text.split(", ");
        LinkedList<String> listName = new LinkedList<>();
        for (int i = 0; i < arrName.length; i++) {
            listName.add(arrName[i].split(" ")[0]);
        }
        TreeMap<Integer, List<String>> tMap = new TreeMap<>(Comparator.reverseOrder());
        System.out.println(listName);
        while (!listName.isEmpty()) {
            int count = 1;
            for (int j = 1; j < listName.size(); j++) {
                if(listName.get(0).equalsIgnoreCase(listName.get(j))){
                    count++;
                    listName.remove(j);
                }
            }
            if(tMap.containsKey(count)){
                tMap.get(count).add(listName.remove(0));
            } else {
                List<String> line = new ArrayList<>();
                line.add(listName.remove(0));
                tMap.put(count, line);
            }
        }
        System.out.println(tMap);
    }
}
