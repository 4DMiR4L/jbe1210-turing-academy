package az.turingacademy.module01.lesson04;

public class SumApp {
    public static void main(String[] args) {
        short engine = 1945;
        int fuel = 5;

        int  turbo = engine * fuel;
        int filter = engine / fuel;
        int door  =  engine % fuel;
        int window = engine + fuel;
        int piston = engine - fuel;

        System.out.println(turbo);
        System.out.println(filter);
        System.out.println(door);
        System.out.println(window);
        System.out.println(piston);

        int x = 10;
        int y = 20;
        int z = 30;
        int w = 40;
        x++;
        y--;
        z-=4;
        w-=5;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
}
