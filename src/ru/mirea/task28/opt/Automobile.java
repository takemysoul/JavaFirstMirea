package ru.mirea.task28.opt;

class Engine
{
    public void start()
    {
        System.out.println("You have started the engine.");
    }
    public void stop()
    {
        System.out.println("You have stopped the engine.");
    }
}

class Wheel
{
    public void pumpUp()
    {
        System.out.println("You have pumped up the wheel.");
    }
}

class Window
{
    public void rollup()
    {
        System.out.println("You have rolled up the window.");
    }
    public void rolldown()
    {
        System.out.println("You have rolled down the window.");
    }
}

class Door
{
    public Window window = new Window();
    public void open()
    {
        System.out.println("You have opened the door.");
    }
    public void close()
    {
        System.out.println("You have closed the door.");
    }
}

public class Automobile
{
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door();
    public Door right = new Door();

    public Automobile()
    {
        for(int i = 0; i < 4; i++)
            wheel[i]= new Wheel();
    }

    public static void main(String[] args)
    {
        Automobile car = new Automobile();
        car.left.window.rollup();
        car.wheel[0].pumpUp();
        car.horn();

        Automobile objwagon = new Automobile().new Wagon();
        objwagon.engine.start();
        objwagon.wheel[3].pumpUp();
        objwagon.horn();
    }

    public void horn()
    {
        System.out.println("beep-beep");
    }

    private class Wagon extends Automobile
    {
        public void horn()
        {
            System.out.println("BEEEEEEP-BEEEEEEP");
        }
    }
}
