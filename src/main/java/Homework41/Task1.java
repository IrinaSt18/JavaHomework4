package Homework41;
import java.util.Collections;
import java.util.LinkedList;
public class Task1 {

        public static void main(String[] args) {
            
            LinkedList<String> linkedList = new LinkedList<>();

            
            linkedList.add("A");
            linkedList.add("B");
            linkedList.add("C");
            linkedList.add("D");

           
            System.out.println("Исходный список: " + linkedList);

            
            Collections.reverse(linkedList);

            
            System.out.println("Перевернутый список: " + linkedList);
        }
    }


