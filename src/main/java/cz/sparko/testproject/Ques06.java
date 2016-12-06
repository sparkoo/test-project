package cz.sparko.testproject;

public class Ques06 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main method");
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.start();
        myDaemonThread.join();

        System.out.println(myDaemonThread.isAlive());
    }
}

class MyDaemonThread extends Thread {

    public MyDaemonThread() {
        setDaemon(true);
    }

    @Override
    public void run() {
        System.out.println("run method");
    }
}
