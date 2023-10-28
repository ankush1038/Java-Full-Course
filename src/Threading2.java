class MyThreadRunnanble1 implements Runnable{
    public void run(){
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
        System.out.println("I am Thread 1");
    }
}
class MyThreadRunnanble2 implements Runnable{
    public void run(){
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
        System.out.println("I am Thread 2");
    }
}


public class Threading2 {
    public static void main(String[] args) {
        MyThreadRunnanble1 n1 = new MyThreadRunnanble1();
        Thread t1 = new Thread(n1);
        MyThreadRunnanble2 n2 = new MyThreadRunnanble2();
        Thread t2 = new Thread(n2);
        t1.start();
        t2.start();
    }
}
