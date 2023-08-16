package Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Phonebook {
    private Map<String, List<Integer>> map = new HashMap<>();

    void add(String name, int phone){
        if(map.containsKey(name)){
            map.get(name).add(phone);
        } else {
            List<Integer> listPhone = new ArrayList<>();
            listPhone.add(phone);
            map.put(name, listPhone);
        }
    }

    void print(String name){
        if(map.containsKey(name)){
            System.out.println(name + " : " + map.get(name));
        } else System.out.println("Ошибка");
        
    }
}
