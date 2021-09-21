package ru.mirea.task1.opt1;

public class Main
{
    public static void main(String[] args)
    {
        int[] massive = {-32, 85, 0, -3, 15};
        int sum = 0;
        int i;
        for (i = 0; i < 5; i++)
        {
            sum += massive[i];
        }
        System.out.println("Result of For: " + sum);

        sum = 0;
        i = 0;

        while (i != 5)
        {
            sum += massive[i];
            i++;
        }
        System.out.println("Result of While: " + sum);

        sum = 0;
        i = 0;

        do
        {
            sum += massive[i];
            i++;
        }
        while (i != 5);
        System.out.println("Result of DoWhile: " + sum);
    }
}
