package ru.mirea.task10.opt4;
import java.util.Scanner;

public class Var15
{
    public void rec(int number)
    {
        if (number != 0)
        {
            System.out.println(number % 10);
            rec(number / 10);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int scanned =  scanner.nextInt();
        Var15 obj = new Var15();
        obj.rec( scanned );
    }
}
