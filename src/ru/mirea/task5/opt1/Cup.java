package ru.mirea.task5.opt1;

class Cup extends Dish
{
    private String picture;

    public Cup (String color, String material, String manufacturer, String form, int cost, int width, int height, String picture)
    {
        super(color, material, manufacturer, form, cost, width, height);
        this.picture = picture;
    }

    public String GetPicture ()
    {
        return picture;
    }

    public void DisplayInfo()
    {
        System.out.println(super.GetColor() + " " + super.GetMaterial() + " cup by " + super.GetManufacturer() + " with " + this.picture + " picture, made in " + super.GetForm() + " form with parametrs: width -  " + super.GetWidth() + ", height - " + super.GetHeight() + ". Costs only " + super.GetCost() + "$");
    }
}
