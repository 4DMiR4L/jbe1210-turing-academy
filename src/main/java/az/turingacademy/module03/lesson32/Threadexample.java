package az.turingacademy.module03.lesson32;

public class Threadexample {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t1.join();
        t2.start();
    }
}
