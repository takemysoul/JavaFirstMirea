package ru.mirea.task2.opt3;

public class Book
{
    private int pages;
    private String author;
    private String name;

    public Book (int p, String a, String n)
    {
        pages = p;
        author = a;
        name = n;
    }

    public Book()
    {
        pages = 0;
        author = "NoName";
        name = "NoTitle";
    }

    public int getPages()
    {
        return pages;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return this.name + " by " + this.author + " in " + this.pages + " pages.";
    }
}
