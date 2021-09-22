package ru.mirea.task6.opt2;

public class TestPriceable
{
    public static void main(String[] args)
    {
        Furniture f = new Furniture("table", "wooden", 300);
        System.out.println("Table price is " + f.getPrice() + "$.");
        Dish d = new Dish("cup", "clay", "red", 10);
        System.out.println("Cup price is " + d.getPrice() + "$.");
    }
}
