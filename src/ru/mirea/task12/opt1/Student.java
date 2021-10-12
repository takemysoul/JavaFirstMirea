package ru.mirea.task12.opt1;

public class Student
{
    private String name;
    private int ID;

    public Student()
    {

    }

    public Student(String name, int ID)
    {
        this.name = name;
        this.ID = ID;
    }

    public String getName()
    {
        return this.name;
    }

    public int getID()
    {
        return this.ID;
    }

    public String toString()
    {
        return "Student name: " + this.name + ", student ID: " + this.ID;
    }
}
