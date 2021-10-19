package ru.mirea.task14.opt4;
import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;

public class DoubleListDeck
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        List<Integer> deck_1 = new LinkedList<>();
        for (int i = 0; i < 5; i++)
            deck_1.add(scanner.nextInt());


        List<Integer> deck_2 = new LinkedList<>();
        for (int i = 0; i < 5; i++)
            deck_2.add(scanner.nextInt());

        while ( !(deck_1.isEmpty()) && !(deck_2.isEmpty()) )
        {
            if (counter >= 106)
            {
                System.out.println("botva");
                break;
            }

            if ( ( ( deck_1.get(0) < deck_2.get(0) ) ||
                    ( (deck_1.get(0) == 9) && (deck_2.get(0) == 0) ) ) &&
                    ( (deck_1.get(0) != 0) || (deck_2.get(0) != 9) )   )
            {
                deck_2.add(deck_1.get(0));
                deck_2.add(deck_2.get(0));
                deck_2.remove(0);
                deck_1.remove(0);
            }
            else
            {
                deck_1.add(deck_1.get(0));
                deck_1.add(deck_2.get(0));
                deck_2.remove(0);
                deck_1.remove(0);
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
