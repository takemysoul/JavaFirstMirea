package ru.mirea.task13.opt2;
import java.util.LinkedList;

public class TestLinkedList
{
    public static void main(String[] args)
    {

        String str1 = new String("Hello World!");
        String str2 = new String("My first linked list test");
        String str3 = new String("I love Java");
        String str4 = new String("I live in constant pain");

        LinkedList<String> list = new LinkedList<>();
        list.add(str3);
        list.add(1, str2);
        list.addFirst(str1);
        list.addLast(str4);

        list.remove(1);
        System.out.println(list);

        System.out.println("First element of list: " + list.peekFirst());
        System.out.println("Last element of list: " + list.peekLast());
    }
}
