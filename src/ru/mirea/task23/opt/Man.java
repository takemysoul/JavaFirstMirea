package ru.mirea.task23.opt;

public class Man
{
    private String noseSize;
    private String eyesColor;
    private String haircut;
    private boolean scars;
    private int dnaCode;

    public Man(String noseSize, String eyesColor, String haircut, boolean scars, int dnaCode)
    {
        this.noseSize = noseSize;
        this.eyesColor = eyesColor;
        this.haircut = haircut;
        this.scars = scars;
        this.dnaCode = dnaCode;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return dnaCode == man.dnaCode;
    }

    @Override
    public int hashCode()
    {
        return dnaCode;
    }

    public static void main(String[] args)
    {
        Man man1 = new Man("картошкой", "карие", "лысый", false, 45153998);
        Man man2 = new Man("картошкой", "карие", "лысый", false, 45153998);
        Man man3 = new Man("картошкой", "карие", "лысый", false, 45153998);
        Man man4 = new Man("картошкой", "карие", "лысый", false, 45153998);
        Man man5 = new Man("картошкой", "карие", "лысый", false, 45153998);


    }
}
