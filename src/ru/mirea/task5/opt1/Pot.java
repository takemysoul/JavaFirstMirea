package ru.mirea.task5.opt1;

class Pot extends Dish
{
    private String typeOfPot;

    public Pot (String color, String material, String manufacturer, String form, int cost, int width, int height, String typeOfPot)
    {
        super(color, material, manufacturer, form, cost, width, height);
        this.typeOfPot = typeOfPot;
    }

    public String GetTypeOfPot ()
    {
        return typeOfPot;
    }

    public void DisplayInfo ()
    {
        System.out.println(super.GetColor() + " " + super.GetMaterial() + " " + this.typeOfPot + " pot by " + super.GetManufacturer() + ", made in " + super.GetForm() + " form with parametrs: width -  " + super.GetWidth() + ", height - " + super.GetHeight() + ". Costs only " + super.GetCost() + "$");
    }
}
