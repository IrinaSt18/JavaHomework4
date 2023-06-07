package Homework42;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.first());  // Вывод: 1

        System.out.println(queue.dequeue());  // Вывод: 1
        System.out.println(queue.dequeue());  // Вывод: 2

        System.out.println(queue.size());  // Вывод: 1
        System.out.println(queue.isEmpty());  // Вывод: false
    }

    public static class Queue {
        private LinkedList<Object> queue;

        public Queue() {
            queue = new LinkedList<>();
        }

        public void enqueue(Object item) {
            queue.addLast(item);
        }

        public Object dequeue() {
            return queue.removeFirst();
        }

        public Object first() {
            return queue.getFirst();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public int size() {
            return queue.size();
        }
    }
}
