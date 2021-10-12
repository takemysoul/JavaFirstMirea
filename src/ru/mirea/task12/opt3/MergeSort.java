package ru.mirea.task12.opt3;
import ru.mirea.task12.opt1.Student;
import java.util.Arrays;

public class MergeSort
{
    public Student[] merge(Student[] group_1, Student[] group_2)
    {
        Student[] merged_group = new Student[group_1.length + group_2.length];

        for (int i = 0; i < group_1.length; i++)
            merged_group[i] = group_1[i];

        for(int i = 0; i < group_2.length; i ++)
            merged_group[i + group_2.length] = group_2[i];

        return merged_group;
    }

    public void mergeSort(Student[] group, int left, int right)
    {
        if (right <= left)
            return;

        int mid = left + (right - left) / 2;
        mergeSort(group, left, mid);
        mergeSort(group, mid + 1, right);

        Student[] buffer = Arrays.copyOf(group, group.length);

        for (int k = left; k <= right; k++)
            buffer[k] = group[k];

        int i = left, j = mid + 1;
        for (int k = left; k <= right; k++)
        {
            if (i > mid)
            {
                group[k] = buffer[j];
                j++;
            }
            else
                if (j > right)
                {
                    group[k] = buffer[i];
                    i++;
                }
                else
                    if (buffer[j].getID() < buffer[i].getID())
                    {
                        group[k] = buffer[j];
                        j++;
                    }
                    else
                    {
                        group[k] = buffer[i];
                        i++;
                    }
        }
    }
}
