import java.util.LinkedList;
import java.util.Queue;

public class Latihan2 {
    public static void queueExample(){
        Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("Remove  : " + queue.remove());
        System.out.println("Element : " + queue.element());
        System.out.println("Queue   : " + queue.poll());
        System.out.println("Peek    : " + queue.peek());
        System.out.println(queue);
    }

    public static void main(String[] args) {
        queueExample();

    }
}
