// Creating a Multiple Thread Using the Runnable Class
class MyTread implements Runnable {
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("thread -- " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("thread interupted..");
            }
        }
    }
}

class MyThread1 implements Runnable {
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("threeeead  --- " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("  ... . .");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {


//        System.out.println(trdObj.isAlive());
//        System.out.println(trdObj.getName());
//        System.out.println(Thread.activeCount());

        MyTread obj = new MyTread();
        MyThread1 obj2 = new MyThread1();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}