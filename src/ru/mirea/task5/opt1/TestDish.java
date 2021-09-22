package ru.mirea.task5.opt1;

public class TestDish
{
    public static void main(String[] args)
    {
        Cup c = new Cup("red", "metal", "Ural", "bended", 20, 10, 15, "kitten");
        c.DisplayInfo();
        Pot p = new Pot ("yellow", "clay", "Ukrain", "rounded", 300, 30, 40, "baking");
        p.DisplayInfo();
    }
}
