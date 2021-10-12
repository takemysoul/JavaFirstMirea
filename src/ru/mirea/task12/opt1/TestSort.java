package ru.mirea.task12.opt1;

public class TestSort
{
    public static void main (String[] args)
    {
        Student[] iDnumber = new Student[]
                {
                        new Student("Armen", 6723),
                        new Student("Arsen", 8233),
                        new Student("Stepa", 8405),
                        new Student("Genrih", 6193),
                        new Student("Kolian", 3451)
                };
        Student temporary;
        int j = 0;

        for (int i = 1; i < 5; i++)
        {
            temporary = iDnumber[i];
            j = i;
            while((j > 0) && (iDnumber[j - 1].getID() > temporary.getID()))
            {
                iDnumber[j] = iDnumber[j - 1];
                j--;
            }
            iDnumber[j] = temporary;
        }

        for (int i = 0; i < 5; i++)
        {
            System.out.println(iDnumber[i]);
        }
    }
}
