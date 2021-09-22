package ru.mirea.task5.opt3;

public abstract class Furniture
{
    private String material;
    private String color;
    private int legs;
    private int height;
    private int width;
    private int depth;
    private int cost;


    public Furniture (String material, String color, int legs, int height, int width, int depth, int cost)
    {
        this.material = material;
        this.color = color;
        this.legs = legs;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.cost = cost;
    }

    public String GetMaterial ()
    {
        return material;
    }

    public String GetColor ()
    {
        return color;
    }

    public int GetLegs ()
    {
        return legs;
    }

    public int GetHeight ()
    {
        return height;
    }

    public int GetWidth ()
    {
        return width;
    }

    public int GetDepth ()
    {
        return depth;
    }

    public int GetCost ()
    {
        return cost;
    }
}
