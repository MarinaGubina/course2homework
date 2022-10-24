
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class TestCashRegister {
    public static void main(String[] args) {

        Queue<String> queue1 = new ArrayDeque<>(5);
        Queue<String> queue2 = new ArrayDeque<>(5);

        for (int i = 0; i < Math.floor(Math.random()*5); i++){
            queue1.offer("Man " + i);
        }

        for (int i = 0; i < Math.floor(Math.random()*5); i++){
            queue2.offer("Woman " + i);
        }

        System.out.println(queue1);
        System.out.println(queue2);

        add("Child1",queue1,queue2);
        add("Child2",queue1,queue2);
        deleteRandomOfQueue(queue1,queue2);

    }

    static void add(String name,Queue<String> q1, Queue<String> q2){
        if(q1.size() == 5 && q2.size() == 5){
            System.out.println("Позовите Галю!");
            return;
        }
        else if(q1.size() > q2.size()){
            q2.add(name);
            System.out.println("Очередь 2 " + q2);
        }
        else{
            q1.add(name);
            System.out.println("Очередь 1 " + q1);
        }
    }
    static void deleteRandomOfQueue(Queue<String> q1, Queue<String> q2){
        if(Math.random() > 0.5){
            q1.poll();
            System.out.println("Случайным образом удаляем из очереди 1 " + q1);
        }
        else {
            q2.poll();
            System.out.println("Случайным образом удаляем из очереди 2 " + q2);
        }
    }
}
