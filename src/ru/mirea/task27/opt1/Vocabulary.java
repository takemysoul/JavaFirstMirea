package ru.mirea.task27.opt1;
import java.util.*;

public class Vocabulary
{
    public static void main(String[] args)
    {
        Map<String, String> DATA_BASE = new HashMap<>();

        DATA_BASE.put("Новиков", "Богдан");
        DATA_BASE.put("Горохов", "Роберт");
        DATA_BASE.put("Седова", "Алиса");
        DATA_BASE.put("Архипова", "Виктория");
        DATA_BASE.put("Наумов", "Роберт");
        DATA_BASE.put("Попов", "Илья");
        DATA_BASE.put("Макарова", "Полина");
        DATA_BASE.put("Овсянникова", "Ангелина");
        DATA_BASE.put("Данилов", "Глеб");
        DATA_BASE.put("Корчагина", "Алиса");

        System.out.println();
        System.out.println(DATA_BASE);

        Map<String, String> copy = DATA_BASE;
        Collection<String> list1 = copy.values();

        Collection<String> list2 = DATA_BASE.values();
        for(Iterator<String> itr = list2.iterator(); itr.hasNext();)
        {
            if(Collections.frequency(list1, itr.next()) > 1)
            {
                itr.remove();
            }
        }

        System.out.println();
        System.out.println(DATA_BASE);
    }
}
