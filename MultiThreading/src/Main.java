// Creating a Thread Using the Thread Class
class MyTread extends Thread{
    public void run(){
        for (int i=1; i<10;i++){
            System.out.println("thread -- " + i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("thread interupted..");
            }
        }
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