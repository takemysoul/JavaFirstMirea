package ru.mirea.task10.opt5;
import java.util.Scanner;

public class Var16
{
    public void rec(int i, int max)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0)
            System.out.println(i);
        else
            if (number > max)
                rec(1, number);
            else
                if (number == max)
                    rec(i+1, max);
                else
                    rec(i,max);
    }

    public static void main(String[] args)
    {
        Var16 obj = new Var16();
        obj.rec(0, 0);
    }
}
