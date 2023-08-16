package Notebook;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(16.2, "Black", 8, 500, "Doors", "Lenono", "Favorite", "H23402Y45039");
        Notebook notebook2 = new Notebook(14.5, "Silver", 4, 250, "Doors", "Lenono", "Dog", "B23467E45056");
        Notebook notebook3 = new Notebook(18.0, "White", 16, 800, "Doors", "Lenono", "Pro", "H25502Y45739");
        Notebook notebook4 = new Notebook(15.7, "White", 16, 750, "Lunix", "PH", "Aloha", "YYY4586045");
        Notebook notebook5 = new Notebook(18.3, "Silver", 8, 500, "migOS", "Upple", "Macantoh", "47239858uIq");
        Notebook notebook6 = new Notebook(16.2, "White", 4, 350, "migOS", "Upple", "IMig", "47212858uIp");

        Set<Notebook> setNotebooks = new HashSet<>();
        setNotebooks.add(notebook1);
        setNotebooks.add(notebook2);
        setNotebooks.add(notebook3);
        setNotebooks.add(notebook4);
        setNotebooks.add(notebook5);
        setNotebooks.add(notebook6);
        UserOptions userOptions = new UserOptions();
        Find find = new Find(setNotebooks, userOptions);
        find.findNotebooks();
        System.out.println(find);

    }
}
