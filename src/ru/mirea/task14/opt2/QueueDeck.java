package ru.mirea.task14.opt2;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class QueueDeck
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        Queue<Integer> deck_1 = new LinkedList<>();
        for (int i = 0; i < 5; i++)
            deck_1.add(scanner.nextInt());


        Queue<Integer> deck_2 = new LinkedList<>();
        for (int i = 0; i < 5; i++)
            deck_2.add(scanner.nextInt());

        while ( !(deck_1.isEmpty()) && !(deck_2.isEmpty()) )
        {
            if (counter >= 106)
            {
                System.out.println("botva");
                break;
            }

            if ( ( ( deck_1.peek() < deck_2.peek() ) ||
                    ( (deck_1.peek() == 9) && (deck_2.peek() == 0) ) ) &&
                    ( (deck_1.peek() != 0) || (deck_2.peek() != 9) )   )
            {
                deck_2.add(deck_1.peek());
                deck_2.add(deck_2.peek());
                deck_2.remove();
                deck_1.remove();
            }
            else
            {
                deck_1.add(deck_1.peek());
                deck_1.add(deck_2.peek());
                deck_2.remove();
                deck_1.remove();
            }
            //System.out.println();
            //System.out.println("step:" + counter);
            //System.out.println(deck_1);
            //System.out.println(deck_2);
            //System.out.println();
            counter++;
        }
        if (counter < 106)
            if (deck_1.isEmpty())
                System.out.println("second " + counter);
            else
                System.out.println("first " + counter);
    }
}
