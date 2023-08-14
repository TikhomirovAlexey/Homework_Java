// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. 
// Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге

public class work_12 {
    public static void main(String[] args) {
        Phonebook book = new Phonebook();
        book.add("Smith", 8963);
        book.add("Connor", 8983);
        book.add("Smith", 8222);
        book.add("Jack", 8111);
        book.print("Smith");
        book.print("Jack");
    }
}
