package ru.mirea.task11.opt1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Choice extends JFrame
{
    private JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private int attempt = 0;
    private int number = (int) (Math.random() * (20));
    private boolean guessed = false;

    public Choice()
    {
        super("Task_11_1");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(300, 300);
        setVisible(true);
        this.startWindow();
    }

    private void startWindow()
    {
        JLabel label = new JLabel("Guess number between 0 and 20: ");
        label.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(label);

        JTextField input = new JTextField(20);
        input.setToolTipText("Write your number here");
        input.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(input);

        JButton button = new JButton("Verify");
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                attempt ++;
                if (attempt >= 4)
                    if(guessed)
                        JOptionPane.showMessageDialog(Choice.this, "You have already won!");
                    else
                        JOptionPane.showMessageDialog(Choice.this, "No more attempts!");
                else
                {
                    if (Integer.parseInt(input.getText()) == number)
                    {
                        JOptionPane.showMessageDialog(Choice.this, "You won!");
                        guessed = true;
                    }
                    else
                    {
                        if(guessed)
                            JOptionPane.showMessageDialog(Choice.this, "You have already won!");
                        else
                            if (Integer.parseInt(input.getText()) < number)
                                JOptionPane.showMessageDialog(Choice.this, "Your number is less than correct one!");
                            else
                                JOptionPane.showMessageDialog(Choice.this, "Your number is greater than correct one!");
                    }
                }
            }
        });
        button.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(button, "North");

        panel.setAlignmentX(CENTER_ALIGNMENT);
        add(panel);
    }

    public static void main (String[] args)
    {
        new Choice().setVisible(true);
    }
}
