package az.turingacademy.module03.lesson32;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Thread started");

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "-" + Thread.currentThread().getName());
        }
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
