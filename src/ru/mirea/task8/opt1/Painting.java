package ru.mirea.task8.opt1;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Painting extends JFrame
{
    public void paint(Graphics g)
    {
        super.paint(g);
        Random rand = new Random();
        float red;
        float green;
        float blue;
        Rectangle rec;
        Circle cir;
        Triangle tri;
        for (int i = 0; i < 21; i++)
        {
            red = rand.nextFloat();
            green = rand.nextFloat();
            blue = rand.nextFloat();
            switch (1 + (int) (Math.random() * 3))
            {
                case (1):
                    rec = new Rectangle(100 + (int) (Math.random() * 1100), 100 + (int) (Math.random() * 700), new Color(red, green, blue));
                    rec.Print(g);
                    break;
                case (2):
                    cir = new Circle(100 + (int) (Math.random() * 1100), 100 + (int) (Math.random() * 700), new Color(red, green, blue));
                    cir.Print(g);
                    break;
                case(3):
                    tri = new Triangle(100 + (int) (Math.random() * 1100), 100 + (int) (Math.random() * 700), new Color(red, green, blue));
                    tri.Print(g);
                    break;
            }
        }


    }

    public Painting()
    {
        super("Lab5_1");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(1200, 800);
        setVisible(true);
    }

    public static void main (String[] args)
    {
        new Painting().setVisible(true);
    }
}
