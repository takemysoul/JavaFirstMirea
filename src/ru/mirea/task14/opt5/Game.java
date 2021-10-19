package ru.mirea.task14.opt5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Stack;

public class Game extends JFrame
{
    private JLabel panel = new JLabel(new ImageIcon("X:\\МИРЭА\\Java_pr\\JavaFirstMirea\\src\\ru\\mirea\\task14\\opt5\\table.jpg"));
    private int counter = 0;
    private JLabel label_3 = new JLabel("");
    private JLabel label_4 = new JLabel("");
    private Stack<Integer> deck_1 = new Stack<>();
    private Stack<Integer> deck_2 = new Stack<>();

    public Game()
    {
        super("«Пьяница»");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(400, 400);
        setVisible(true);
        setResizable(false);
        shuffle();
        this.startWindow();
    }

    private void startWindow()
    {
        panel.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createMainMenu());
        menuBar.add(createInfoMenu());
        setJMenuBar(menuBar);

        JLabel label_1 = new JLabel("Можете прочитать правила во вкладке Rules");
        label_1.setFont(new Font("Koh Santepheap", Font.PLAIN, 16));
        label_1.setForeground(Color.WHITE);
        label_1.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(label_1);

        JLabel label_2 = new JLabel("             или играть сразу.        ");
        label_2.setFont(new Font("Koh Santepheap", Font.PLAIN, 16));
        label_2.setForeground(Color.WHITE);
        label_2.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(label_2);

        JButton button = new JButton(" Показать верхние карты обеих колод ");
        button.setFont(new Font("Koh Santepheap", Font.PLAIN, 16));
        button.setAlignmentX(CENTER_ALIGNMENT);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (counter >= 106)
                {
                    JOptionPane.showMessageDialog(Game.this, "botva - слишком много итераций");
                }
                else
                {
                    if( deck_1.isEmpty() || deck_2.isEmpty() )
                    {
                        if (deck_1.isEmpty())
                            JOptionPane.showMessageDialog(Game.this, "Вы выиграли! Прошло " + counter + " ходов.");
                        else
                            JOptionPane.showMessageDialog(Game.this, "Вы проиграли! Прошло " + counter + " ходов.");
                    }
                    else
                    {
                        label_3.setText("Карта оппонента: " + deck_1.get(0) + "          Карт в его колоде: " + deck_1.size());
                        label_4.setText("Ваша карта: " + deck_2.get(0) + "          Карт в вашей колоде: " + deck_2.size());
                        if ( ( ( deck_1.get(0) < deck_2.get(0) ) ||
                                ( (deck_1.get(0) == 9) && (deck_2.get(0) == 0) ) ) &&
                                ( (deck_1.get(0) != 0) || (deck_2.get(0) != 9) )   )
                        {
                            deck_2.push(deck_1.get(0));
                            deck_2.push(deck_2.get(0));
                            deck_2.removeElementAt(0);
                            deck_1.removeElementAt(0);
                        }
                        else
                        {
                            deck_1.push(deck_1.get(0));
                            deck_1.push(deck_2.get(0));
                            deck_2.removeElementAt(0);
                            deck_1.removeElementAt(0);
                        }

                        counter++;
                    }
                }
            }
        });
        button.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(button);

        JButton button_2 = new JButton("Посмотреть результат, пропустив шаги");
        button_2.setFont(new Font("Koh Santepheap", Font.PLAIN, 16));
        button_2.setAlignmentX(CENTER_ALIGNMENT);
        button_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                while ( !(deck_1.isEmpty()) && !(deck_2.isEmpty()) )
                {
                    if (counter >= 106)
                    {
                        JOptionPane.showMessageDialog(Game.this, "botva - слишком много итераций");
                        break;
                    }
                    else
                    {
                        if ( ( ( deck_1.get(0) < deck_2.get(0) ) ||
                                ( (deck_1.get(0) == 9) && (deck_2.get(0) == 0) ) ) &&
                                ( (deck_1.get(0) != 0) || (deck_2.get(0) != 9) )   )
                        {
                            deck_2.push(deck_1.get(0));
                            deck_2.push(deck_2.get(0));
                            deck_2.removeElementAt(0);
                            deck_1.removeElementAt(0);
                        }
                        else
                        {
                            deck_1.push(deck_1.get(0));
                            deck_1.push(deck_2.get(0));
                            deck_2.removeElementAt(0);
                            deck_1.removeElementAt(0);
                        }

                        counter++;
                    }
                }
                if( counter < 106 )
                {
                    if (deck_1.isEmpty())
                        JOptionPane.showMessageDialog(Game.this, "Вы выиграли! Прошло " + counter + " ходов.");
                    else
                        JOptionPane.showMessageDialog(Game.this, "Вы проиграли! Прошло " + counter + " ходов.");
                }
            }
        });
        button_2.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(button_2);

        label_3.setFont(new Font("Koh Santepheap", Font.PLAIN, 16));
        label_3.setForeground(Color.WHITE);
        label_3.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(label_3);

        label_4.setFont(new Font("Koh Santepheap", Font.PLAIN, 16));
        label_4.setForeground(Color.WHITE);
        label_4.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(label_4);

        panel.setAlignmentX(CENTER_ALIGNMENT);
        add(panel);
    }

    private JMenu createMainMenu()
    {
        JMenu info = new JMenu("Menu");
        JMenuItem var1  = new JMenuItem("New Game");
        JMenuItem var2  = new JMenuItem("Exit");
        info.add(var1);
        info.add( new JSeparator());
        info.add(var2);

        var1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                shuffle();
                counter = 0;
                label_3.setText("");
                label_4.setText("");
            }
        });
        var2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                System.exit(0);
            }
        });

        return info;
    }

    private JMenu createInfoMenu()
    {
        JMenu info = new JMenu("Rules");
        JMenuItem var1  = new JMenuItem("Rus");
        JMenuItem var2  = new JMenuItem("Eng");
        info.add(var1);
        info.add( new JSeparator());
        info.add(var2);

        var1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                JOptionPane.showMessageDialog(Game.this,
                        "В игре участвует 10 карт, имеющих значения от 0 до 9,\n" +
                        "большая карта побеждает меньшую; карта «0» побеждает карту «9».\n" +
                        "Карточная колода раздается поровну двум игрокам. Далее они \n" +
                        "открывают по одной верхней карте, и тот, чья карта старше, \n" +
                        "забирает себе обе открытые карты, которые кладутся под низ его колоды.\n" +
                                "Тот, кто остается без карт, проигрывает.");
            }
        });
        var2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                JOptionPane.showMessageDialog(Game.this,
                        "The game involves 10 cards from 0 to 9,\n" +
                        "the larger card wins the smaller one; card «0» beats card «9».\n" +
                        "A deck of cards is dealt equally between two players. Then they\n" +
                        "reveal one top card each, and the one whose card is higher takes\n" +
                        "both of the open cards for himself, then put them under the bottom of his deck.\n" +
                        "The one who is left without cards loses.");
            }
        });

        return info;
    }

    public void shuffle()
    {
        int temporary, rand_1, rand_2;
        Random random = new Random();

        deck_1.clear();
        for (int i = 0; i < 5; i++)
            deck_1.push(i);

        deck_2.clear();
        for (int i = 0; i < 5; i++)
            deck_2.push(i + 5);

        for(int i = 0; i < 100; i++)
        {
            rand_1 = random.nextInt(5);
            rand_2 = random.nextInt(5);
            temporary = deck_1.get(rand_1);
            deck_1.set(rand_1, deck_2.get(rand_2));
            deck_2.set(rand_2, temporary);
        }
    }

    public static void main (String[] args)
    {
        new Game().setVisible(true);
    }
}
