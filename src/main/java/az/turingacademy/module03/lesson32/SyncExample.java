package az.turingacademy.module03.lesson32;

public class SyncExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() ->{
            for (int i = 0; i < 10; i++) counter.increment();
        });

        Thread t2 = new Thread(() ->{
            for (int i = 0; i < 100; i++) counter.increment();
        });
        t1.start();
        for (int i = 0; i < 100; i++){
         System.out.println(Thread.currentThread().getName() + " " + i);
        }
        try {
            t2.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("-------------------------");
        t2.start();
        for (int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}
