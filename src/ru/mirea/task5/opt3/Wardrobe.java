package ru.mirea.task5.opt3;

public class Wardrobe extends Furniture
{
    private int shelves;
    private int doors;

    public Wardrobe (String material, String color, int legs, int height, int width, int depth, int cost, int shelves, int doors)
    {
        super(material, color, legs, height, width, depth, cost);
        this.shelves = shelves;
        this.doors = doors;
    }

    public int GetShelves ()
    {
        return shelves;
    }

    public int GetDoors ()
    {
        return doors;
    }

    public void DisplayInfo()
    {
        System.out.println(super.GetColor() + " " + super.GetMaterial() + " wardrobe with " + super.GetLegs() + " legs, " + GetShelves() + " shelves and " + GetDoors() + " doors have parameters: height - " + super.GetHeight() + ", width - " + super.GetWidth() + ", depth - " + super.GetDepth() + ". Costs only " + super.GetCost() + "$");
    }
}
