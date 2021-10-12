package ru.mirea.task12.opt2;
import ru.mirea.task12.opt1.Student;

public class SortingStudentsByGPA implements Comparator
{
    public void sortByGPA(Student group[], int low, int high)
    {
        if (group.length == 0 || low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student support = group[middle];

        int i = low, j = high;
        while (i <= j) {
            while (group[i].getFinal_mark() > support.getFinal_mark()) {
                i++;
            }

            while (group[j].getFinal_mark() < support.getFinal_mark()) {
                j--;
            }

            if (i <= j) {
                Student temporary = group[i];
                group[i] = group[j];
                group[j] = temporary;
                i++;
                j--;
            }
        }

        if (low < j)
            sortByGPA(group, low, j);

        if (high > i)
            sortByGPA(group, i, high);
    }
}
