// Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class work_10 {
    public static void main(String[] args) {
        Queuewrk10 queuewrk10 = new Queuewrk10();
        queuewrk10.enqueue(0);
        queuewrk10.enqueue(1);
        queuewrk10.enqueue(2);
        queuewrk10.enqueue(3);
        queuewrk10.print();
        System.out.println(queuewrk10.dequeue());
        queuewrk10.print();
        System.out.println(queuewrk10.first());
    }

}
