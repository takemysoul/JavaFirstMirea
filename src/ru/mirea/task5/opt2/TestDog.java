package ru.mirea.task5.opt2;

public class TestDog
{
    public static void main(String[] args)
    {
        Dalmatian d = new Dalmatian("medium skinny", "short white", "King", 8, 80, "black dot");
        Pug p = new Pug("short curl", "short yellowish", "Barrel", 6, 46, "flat black");
        d.DisplayInfo();
        p.DisplayInfo();
    }
}
