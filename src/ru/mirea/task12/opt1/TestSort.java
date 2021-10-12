package ru.mirea.task12.opt1;
import ru.mirea.task12.opt2.SortingStudentsByGPA;
import ru.mirea.task12.opt3.MergeSort;

public class TestSort
{
    public static void main (String[] args)
    {
        System.out.println("----------------------opt1----------------------");
        Student[] iDnumber = new Student[]
                {
                        new Student("Armen", 6723, 4),
                        new Student("Arsen", 8233, 2),
                        new Student("Stepa", 8405, 4),
                        new Student("Genrih", 6193, 5),
                        new Student("Kolian", 3451, 3)
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

        System.out.println("----------------------opt2----------------------");

        new SortingStudentsByGPA().sortByGPA(iDnumber, 0, 4);

        for (int i = 0; i < 5; i++)
        {
            System.out.println(iDnumber[i]);
        }

        System.out.println("----------------------opt3----------------------");

        Student[] group_2 = new Student[]
                {
                        new Student("Vladislav", 8943, 3),
                        new Student("Mikhail", 6578, 2),
                        new Student("Billy", 1682, 5),
                        new Student("Hagrid", 5940, 3),
                        new Student("Vovan", 2731, 4)
                };

        Student[] merged_group = new MergeSort().merge(iDnumber, group_2);
        new MergeSort().mergeSort(merged_group, 0, 9);

        for (int i = 0; i < 10; i++)
        {
            System.out.println(merged_group[i]);
        }
    }
}
