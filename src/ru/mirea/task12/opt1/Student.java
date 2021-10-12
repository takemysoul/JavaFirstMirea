package ru.mirea.task12.opt1;

public class Student
{
    private String name;
    private int ID;
    private int final_mark;

    public Student()
    {

    }

    public Student(String name, int ID, int final_mark)
    {
        this.name = name;
        this.ID = ID;
        this.final_mark = final_mark;
    }

    public String getName()
    {
        return this.name;
    }

    public int getID()
    {
        return this.ID;
    }

    public int getFinal_mark()
    {
        return this.final_mark;
    }

    public String toString()
    {
        return "Student name: " + this.name + ", student ID: " + this.ID + ", final mark: " + this.final_mark;
    }
}
