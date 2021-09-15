package ru.mirea.task4.opt1;

public class Author {
    private String email;
    private String name;
    private char gender;

    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    public String getName()
    {
        return name;
    }

    public char getGender()
    {
        return gender;
    }

    public String toString ()
    {
        return("Name: " + this.name + ", email: " + this.email + ", gender: " + this.gender);
    }
}
