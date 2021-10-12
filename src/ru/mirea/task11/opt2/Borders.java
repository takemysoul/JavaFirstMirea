package ru.mirea.task11.opt2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Borders extends JFrame
{
    private JPanel panel = new JPanel(new BorderLayout());

    public Borders()
    {
        super("Task_11_2");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(555, 300);
        setVisible(true);
        this.startWindow();
    }

    private void startWindow()
    {
        JButton button_north = new JButton("From the very top u go.");
        button_north.setBorder(BorderFactory.createMatteBorder(4, 4, 2, 4, Color.RED));
        button_north.addMouseListener(new MouseListener()
        {
            public void mouseReleased(MouseEvent e) {}
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
            public void mouseEntered(MouseEvent e)
            {
                    JOptionPane.showMessageDialog(Borders.this, "You have entered from the top!");
            }
        });

        JButton button_west = new JButton("It's a good place for ur mouse.");
        button_west.setBorder(BorderFactory.createMatteBorder(2, 4, 2, 2, Color.RED));
        button_west.addMouseListener(new MouseListener()
        {
            public void mouseReleased(MouseEvent e) {}
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
            public void mouseEntered(MouseEvent e)
            {
                JOptionPane.showMessageDialog(Borders.this, "You have entered from left!");
            }
        });

        JButton button_east = new JButton("Maybe drag ur mouse here?");
        button_east.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 4, Color.RED));
        button_east.addMouseListener(new MouseListener()
        {
            public void mouseReleased(MouseEvent e) {}
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
            public void mouseEntered(MouseEvent e)
            {
                JOptionPane.showMessageDialog(Borders.this, "You have entered from right!");
            }
        });

        JButton button_center = new JButton("How is it possible to appear here?");
        button_center.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
        button_center.addMouseListener(new MouseListener()
        {
            public void mouseReleased(MouseEvent e) {}
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
            public void mouseEntered(MouseEvent e)
            {
                JOptionPane.showMessageDialog(Borders.this, "You are at the middle of nowhere!");
            }
        });

        JButton button_south = new JButton("Place u'ld better not to enter.");
        button_south.setBorder(BorderFactory.createMatteBorder(2, 4, 4, 4, Color.RED));
        button_south.addMouseListener(new MouseListener()
        {
            public void mouseReleased(MouseEvent e) {}
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
            public void mouseEntered(MouseEvent e)
            {
                JOptionPane.showMessageDialog(Borders.this, "You have reached the very bottom!");
            }
        });

        panel.add(button_west, BorderLayout.WEST);
        panel.add(button_east, BorderLayout.EAST);
        panel.add(button_center, BorderLayout.CENTER);
        panel.add(button_south, BorderLayout.SOUTH);
        panel.add(button_north, BorderLayout.NORTH);

        add(panel);
    }

    public static void main (String[] args)
    {
        new Borders().setVisible(true);
    }
}
