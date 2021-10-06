package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Matches extends JFrame
{
    JLabel label_1 = new JLabel("Result: 0 X 0");
    JLabel label_2 = new JLabel("Last Scorer: ");
    Label label_3 = new Label("Winner: DRAW");
    private JPanel panel = new JPanel();
    private BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
    private int milan = 0;
    private int madrid = 0;

    public Matches()
    {
        super("Task_9");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(300, 300);
        setVisible(true);
        this.startWindow();
    }

    private void startWindow()
    {
        panel.setLayout(boxLayout);

        JButton button_1 = new JButton("AC Milan");
        button_1.addActionListener (new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                milan++;
                label_1.setText("Result: " + milan + " X " + madrid);
                label_2.setText("Last Scorer: Milan");
                if(madrid > milan)
                    label_3.setText("Winner: Madrid");
                else
                if(madrid < milan)
                    label_3.setText("Winner: Milan");
                else
                    label_3.setText("Winner: DRAW");
                panel.add(label_1);
                panel.add(label_2);
                panel.add(label_3);
            }
        });

        JButton button_2 = new JButton("Real Madrid");
        button_2.addActionListener (new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                madrid++;
                label_1.setText("Result: " + milan + " X " + madrid);
                label_2.setText("Last Scorer: Madrid");
                if(madrid > milan)
                    label_3.setText("Winner: Madrid");
                else
                    if(madrid < milan)
                        label_3.setText("Winner: Milan");
                    else
                        label_3.setText("Winner: DRAW");
                panel.add(label_1);
                panel.add(label_2);
                panel.add(label_3);
            }
        });

        button_1.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(button_1, "North");
        button_2.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(button_2, "North");

        label_1.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(label_1);
        label_2.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(label_2);
        panel.add(label_3);

        panel.setAlignmentX(CENTER_ALIGNMENT);
        add(panel);
    }

    public static void main (String[] args)
    {
        new Matches().setVisible(true);
    }
}
