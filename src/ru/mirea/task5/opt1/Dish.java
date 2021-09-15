package ru.mirea.task5.opt1;

public abstract class Dish
{
    private String color;
    private String material;
    private String manufacturer;
    private String form;
    private int cost;
    private int width;
    private int height;


    public Dish (String color, String material, String manufacturer, String form, int cost, int width, int height)
    {
        this.color = color;
        this.material= material;
        this.manufacturer = manufacturer;
        this.form= form;
        this.cost = cost;
        this.width = width;
        this.height = height;
    }

    public String GetColor ()
    {
        return color;
    }

    public String GetMaterial ()
    {
        return material;
    }

    public String GetManufacturer ()
    {
        return manufacturer;
    }

    public String GetForm ()
    {
        return form;
    }

    public int GetCost ()
    {
        return cost;
    }

    public int GetHeight ()
    {
        return height;
    }

    public int GetWidth ()
    {
        return width;
    }

    public void SetCost(int sum)
    {
        cost = sum;
    }
}
