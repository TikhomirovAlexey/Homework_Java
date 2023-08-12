import java.util.LinkedList;
import java.util.Queue;

public class Queuewrk10 {

    private Queue<Integer> queue = new LinkedList<>();
    
    void enqueue(int num){
        queue.add(num);
    } 

    void print(){
        for(Integer num: queue){
        System.out.print(num);
        }
        System.out.println();
    }

    int dequeue(){
        return queue.remove();
    }

    int first(){
        return queue.element();
    }
}
