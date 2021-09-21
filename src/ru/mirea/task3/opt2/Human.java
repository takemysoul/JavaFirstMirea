package ru.mirea.task3.opt2;

public class Human
{
    private Hand right_hand;
    private Hand left_hand;
    private Leg right_leg;
    private Leg left_leg;
    private Head head;
    private String gender;

    public Human (Hand right_hand, Hand left_hand, Leg right_leg, Leg left_leg, Head head, String gender)
    {
        this.right_hand = right_hand;
        this.left_hand = left_hand;
        this.right_leg = right_leg;
        this.left_leg = left_leg;
        this.head = head;
        this.gender = gender;
    }

    public Human ()
    {
        right_hand = new Hand();
        left_hand = new Hand();
        right_leg = new Leg();
        left_leg = new Leg();
        head = new Head();
        gender = "male";
    }

    public void SetGender(String gender)
    {
        this.gender = gender;
    }

    public String GetGender()
    {
        return gender;
    }

    public String toString()
    {
        return this.gender + " body with: " + this.head + "Right hand: " + this.right_hand + "Left hand: " + this.left_hand + "Right leg: " + this.right_leg + "Left leg: " + this.left_leg;
    }
}
