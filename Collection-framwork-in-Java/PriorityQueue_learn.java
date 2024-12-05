import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_learn {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.offer(30);
        priorityQueue.offer(3000);
        priorityQueue.offer(9);
        priorityQueue.offer(300);
        // priority queue are used in min-heap ....and this minimum value at top first

        System.out.println(priorityQueue);

    }
}
