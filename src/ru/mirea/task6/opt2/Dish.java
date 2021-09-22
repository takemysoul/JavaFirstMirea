package ru.mirea.task6.opt2;

public class Dish implements Priceable
{
    private String type;
    private String material;
    private String color;
    private int cost;

    public Dish (String type, String material, String color, int cost)
    {
        this.type = type;
        this.material = material;
        this.color = color;
        this.cost = cost;
    }

    public int getPrice()
    {
        return cost;
    }
}
