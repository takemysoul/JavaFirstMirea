package ru.mirea.task10.opt2;
import java.util.Scanner;

public class Var13
{
    public void rec()
    {
        Scanner scanner = new Scanner(System.in);
        int number_1 = scanner.nextInt();
        if (number_1 != 0)
        {
            System.out.println(number_1);
            int number_2 = scanner.nextInt();
            if (number_2 != 0)
                rec();
        }
    }

    public static void main(String[] args)
    {
        Var13 obj = new Var13();
        obj.rec();
    }
}
