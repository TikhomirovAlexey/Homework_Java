// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

import java.util.ArrayList;
import java.util.List;

public class work_8 {
    public static void main(String[] args) {
        List<String> listPlanets = new ArrayList<>();
        listPlanets.add("Земля");
        listPlanets.add("Марс");
        listPlanets.add("Юпитер");
        listPlanets.add("Марс");
        listPlanets.add("Плутон");
        listPlanets.add("Земля");
        listPlanets.add("Плутон");
        listPlanets.add("Земля");
        listPlanets.add("Юпитер");
        listPlanets.add("Плутон");
        listPlanets.add("Плутон");
        listPlanets.add("Марс");
        printCount(listPlanets);
    }

    static void printCount(List<String> list){
        List<String> tmpMemory = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(!tmpMemory.contains(list.get(i))){
                tmpMemory.add(list.get(i));
                int count = 1;
                for (int j = i + 1; j < list.size(); j++) {
                    if(list.get(i).equals(list.get(j))){
                        count++;
                    }
                }
                System.out.printf("%s встречается %d раз(а)\n", list.get(i), count);
            }
        }
    }
}
