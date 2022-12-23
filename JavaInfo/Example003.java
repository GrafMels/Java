import java.util.*;
public class Example003 {
    public static void main(String[] args) {  
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    pq.add(123);
    pq.add(3);
    pq.add(13);
    pq.add(1);
    System.out.println(pq);//Элементы выстроились в порядке возрастания

    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq);//Элементы считываются и удаляються по очередно

    System.out.println("\n\n\n");
    

    Queue<Integer> Queue = new LinkedList<Integer>();
    Queue.add(123);
    Queue.add(3);
    Queue.add(13);
    Queue.add(1);
    System.out.println(Queue);//Элементы по порядку внесения   

    System.out.println(Queue.poll());
    System.out.println(Queue.poll());
    System.out.println(Queue);//Элементы считываются и удаляються по очередно, но очередб устанавливаеться от минимального к максимальному
    }
}
