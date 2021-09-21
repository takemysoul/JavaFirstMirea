package ru.mirea.task3.opt3;

public class Book
{
    private int pages;
    private String author;
    private String name;
    private int year;

    public Book (int p, String a, String n, int y)
    {
        pages = p;
        author = a;
        name = n;
        year = y;
    }

    public Book()
    {
        pages = 0;
        author = "NoName";
        name = "NoTitle";
        year = 0;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setYear(int year)
    {
        this.year = year;
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

    public int getYear()
    {
        return year;
    }

    public String toString()
    {
        return this.name + " by " + this.author + " in " + this.pages + " pages, " + this.year + " year.";
    }
}
