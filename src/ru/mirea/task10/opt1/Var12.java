package ru.mirea.task10.opt1;
import java.util.Scanner;

public class Var12
{
    public void rec()
    {
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();
        if ((number % 2) == 1)
        {
            System.out.println(number);
            rec();
        }
        else
            if (number != 0)
                rec();
    }

    public static void main(String[] args)
    {
        Var12 obj = new Var12();
        obj.rec();
    }
}
