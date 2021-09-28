package ru.mirea.task8.opt3;
import javax.swing.*;
import java.awt.*;

public class NedoGif extends JFrame
{
    private JLabel pictureLabel;
    private Container controls;

    public NedoGif()
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
        pictureLabel = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().createImage("X:/МИРЭА/Java_pr/JavaFirstMirea/src/ru/mirea/task8/opt3/dance.gif")));
        controls.add(pictureLabel);
            /*pictureLabel = new JLabel(new ImageIcon("X:/МИРЭА/Java_pr/JavaFirstMirea/src/ru/mirea/task8/opt3/frame1.png"));
            controls.add(pictureLabel);
            getContentPane().removeAll();
            getContentPane().repaint();
            pictureLabel = new JLabel(new ImageIcon("X:/МИРЭА/Java_pr/JavaFirstMirea/src/ru/mirea/task8/opt3/frame2.png"));
            controls.add(pictureLabel);
            getContentPane().removeAll();
            getContentPane().repaint();
            pictureLabel = new JLabel(new ImageIcon("X:/МИРЭА/Java_pr/JavaFirstMirea/src/ru/mirea/task8/opt3/frame3.png"));
            controls.add(pictureLabel);*/
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                NedoGif w = new NedoGif();
                w.setVisible(true);
            }
        });
    }
}