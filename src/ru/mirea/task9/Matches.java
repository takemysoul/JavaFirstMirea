package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;

public class Matches extends JFrame
{
    public void paint(Graphics g)
    {
        super.paint(g);

    }

    public Matches()
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
        new Matches().setVisible(true);
    }
}
