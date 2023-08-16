package Notebook;

import java.util.Set;
import java.util.Map;
import java.util.HashSet;


public class Find {
    private Set<Notebook> setN;
    private Map<String, String> options;
    private Set<Notebook> resultFind;

    Find(Set<Notebook> setNotebooks, UserOptions userOptions) {
        setN = setNotebooks;
        options = userOptions.getUserOptions();
        resultFind = new HashSet<>();
    }

    public void findNotebooks() {
        for (Notebook notebook : setN) {
            boolean flag = true;
            for (var element : options.entrySet()) {
                switch (element.getKey()) {
                    case "brand":
                        if (!(notebook.getBrand().equalsIgnoreCase(element.getValue()))) {
                            flag = false;
                        }
                        break;
                    case "name":
                        if (!(notebook.getName().equalsIgnoreCase(element.getValue()))) {
                            flag = false;
                        }
                        break;
                    case "diagonal":
                        if (!(notebook.getDiagonal() >= Double.parseDouble(element.getValue()))) {
                            flag = false;
                        }
                        break;
                    case "color":
                        if (!(notebook.getColor().equalsIgnoreCase(element.getValue()))) {
                            flag = false;
                        }
                        break;
                    case "memoryRAM":
                        if (!(notebook.getMemoryRAM() >= Integer.parseInt(element.getValue()))) {
                            flag = false;
                        }
                        break;
                    case "memoryHDD":
                        if (!(notebook.getMemoryHDD() >= Integer.parseInt(element.getValue()))) {
                            flag = false;
                        }
                        break;
                    case "operatingSystem":
                        if (!(notebook.getOperatingSystem().equalsIgnoreCase(element.getValue()))) {
                            flag = false;
                        }
                        break;
                }
            }
            if (flag) {
                resultFind.add(notebook);
            }
        }
    }

    public String toString(){
        String tmpString = "";
        for (Notebook notebook : resultFind) {
            tmpString += "brand: " + notebook.getBrand() + "\nname: " + notebook.getName() + "\ndiagonal: " + notebook.getDiagonal() + "\ncolor: " + notebook.getColor() + "\nmemoryRAM: " + notebook.getMemoryRAM() + "\nmemoryHDD: " + notebook.getMemoryHDD() + "\noperatingSystem: " + notebook.getOperatingSystem() + "\npersonalCode: " + notebook.getPersonalCode() + "\n" + "\n";
        }
        return tmpString;
    }

}