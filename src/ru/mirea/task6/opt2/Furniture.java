package ru.mirea.task6.opt2;

public class Furniture implements Priceable
{
    private String type;
    private String material;
    private int cost;

    public Furniture(String type, String material, int cost)
    {
        this.type = type;
        this.material = material;
        this.cost = cost;
    }

    public int getPrice()
    {
        return cost;
    }
}
