package ru.mirea.task3.opt2;

public class Head
{
    private int ears;
    private int eyes;
    private String eyes_color;
    private String hair;
    private String nose;

    public Head(int ears, int eyes, String eyes_color, String hair, String nose)
    {
        this.ears = ears;
        this.eyes = eyes;
        this.eyes_color = eyes_color;
        this.hair = hair;
        this.nose = nose;
    }

    public Head()
    {
        ears = 2;
        eyes = 2;
        eyes_color = "brown";
        hair = "short dark";
        nose = "sharp";
    }

    public void setEars (int ears)
    {
        this.ears = ears;
    }

    public void setEyes (int eyes)
    {
        this.eyes = eyes;
    }

    public void setEyes_color (String eyes_color)
    {
        this.eyes_color = eyes_color;
    }

    public void setHair (String hair)
    {
        this.hair = hair;
    }

    public void setNose (String nose)
    {
        this.nose = nose;
    }

    public int getEars ()
    {
        return ears;
    }

    public int getEyes ()
    {
        return eyes;
    }

    public String getEyes_color ()
    {
        return eyes_color;
    }

    public String getNose ()
    {
        return nose;
    }

    public String getHair ()
    {
        return hair;
    }

    public String toString()
    {
        return "head with " + this.ears + " ears, " + this.eyes + " "+ this.eyes_color + " eyes, " + this.hair + " hair and " + this.nose + " nose. ";
    }
}
