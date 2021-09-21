package ru.mirea.task3.opt3;

import ru.mirea.task2.opt4.Dog;

public class BookTest
{
    public static void main(String[] args)
    {
        Book b1 = new Book(126, "Pushkin A.S.", "Captain's daughter", 1836);
        Book b2 = new Book();
        b2.setPages(22);
        b2.setAuthor("Boka and Joka");
        b2.setName("Best anecdotes");
        b2.setYear(2007);
        System.out.println(b1);
        System.out.println(b2);
    }
}
