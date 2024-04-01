package task;

import java.util.*;  
public class LinkedList1  
{  
    public static void main(String[] args)   
    {  
        // Create a LinkedList to store integers  
        LinkedList<Integer> linkedList1 = new LinkedList<>();  
        // Add elements to the LinkedList  
        linkedList1.add(10);  
        linkedList1.add(20);  
        linkedList1.add(30);  
        linkedList1.add(40);  
        linkedList1.add(50);  
  
        // Print the LinkedList  
        System.out.println("LinkedList:"+linkedList1);  
  
        // Remove an element from the LinkedList  
        linkedList1.removeFirst();  
        System.out.println("LinkedList after removing first element:"+linkedList1);  
  
        // Get the first and last elements of the LinkedList  
        int firstElement=linkedList1.getFirst();  
        int lastElement=linkedList1.getLast();  
        System.out.println("First element:"+firstElement);  
        System.out.println("Last element:"+lastElement);  
  
        // Clear the LinkedList  
        linkedList1.clear();  
        System.out.println("LinkedList after clearing:"+linkedList1);  
    }  
}  