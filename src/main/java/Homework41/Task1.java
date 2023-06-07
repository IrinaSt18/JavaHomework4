package Homework41;
import java.util.Collections;
import java.util.LinkedList;
public class Task1 {

        public static void main(String[] args) {
            // Создание LinkedList
            LinkedList<String> linkedList = new LinkedList<>();

            // Добавление элементов в LinkedList
            linkedList.add("A");
            linkedList.add("B");
            linkedList.add("C");
            linkedList.add("D");

            // Вывод исходного списка
            System.out.println("Исходный список: " + linkedList);

            // Переворачиваем список с помощью Collections.reverse()
            Collections.reverse(linkedList);

            // Вывод перевернутого списка
            System.out.println("Перевернутый список: " + linkedList);
        }
    }


