package ru.mirea.task8.opt2;
import java.awt.*;
import javax.swing.*;

public class Picture extends JFrame
{
    private JLabel pictureLabel;
    private Container controls;

    public Picture()
    {
        super("Lab5_2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        this.setSize(1200, 800);
        this.startWindow();
    }

    private void startWindow()
    {
        controls = new Container();
        controls = getContentPane();
        controls.setLayout(new FlowLayout());
        pictureLabel = new JLabel(new ImageIcon("X:/МИРЭА/Java_pr/JavaFirstMirea/src/ru/mirea/task8/opt2/image.png"));
        controls.add(pictureLabel);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                Picture w = new Picture();
                w.setVisible(true);
            }
        });
    }
}
