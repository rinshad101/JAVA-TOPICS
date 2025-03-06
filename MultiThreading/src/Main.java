class MyTread extends Thread{
    public void run(){
        System.out.println("this is a tread....");
    }
}

public class Main {
    public static void main(String[] args) {
        MyTread trdObj = new MyTread();
        trdObj.start();
        System.out.println(trdObj.isAlive());
        System.out.println(trdObj.getName());
        System.out.println(Thread.activeCount());
    }
}