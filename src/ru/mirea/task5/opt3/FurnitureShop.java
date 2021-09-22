package ru.mirea.task5.opt3;

public class FurnitureShop
{
    public static void main(String[] args)
    {
        Chair c = new Chair("steel", "green", 3, 120, 40, 40, 50, "none", "none");
        Wardrobe w = new Wardrobe("wooden", "white", 0, 220, 180, 80, 200, 4, 2);
        c.DisplayInfo();
        w.DisplayInfo();
    }
}
