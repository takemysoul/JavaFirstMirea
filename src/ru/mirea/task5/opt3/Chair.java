package ru.mirea.task5.opt3;

public class Chair extends Furniture
{
    private String back;
    private String armrest;

    public Chair (String material, String color, int legs, int height, int width, int depth, int cost, String back, String armrest)
    {
        super(material, color, legs, height, width, depth, cost);
        this.back = back;
        this.armrest = armrest;
    }

    public String GetBack ()
    {
        return back;
    }

    public String GetArmrest ()
    {
        return armrest;
    }

    public void DisplayInfo()
    {
        System.out.println(super.GetColor() + " " + super.GetMaterial() + " chair with " + super.GetLegs() + " legs, " + GetBack() + " back and " + GetArmrest() + " armrests have parameters: height - " + super.GetHeight() + ", width - " + super.GetWidth() + ", depth - " + super.GetDepth() + ". Costs only " + super.GetCost() + "$");
    }
}
