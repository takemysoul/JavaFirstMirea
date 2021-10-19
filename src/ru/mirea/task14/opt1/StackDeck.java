package ru.mirea.task14.opt1;
import java.util.Stack;
import java.util.Scanner;

public class StackDeck
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        Stack<Integer> deck_1 = new Stack<>();
        for (int i = 0; i < 5; i++)
            deck_1.push(scanner.nextInt());


        Stack<Integer> deck_2 = new Stack<>();
        for (int i = 0; i < 5; i++)
            deck_2.push(scanner.nextInt());

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
