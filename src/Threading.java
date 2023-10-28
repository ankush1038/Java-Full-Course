class myThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<5) {
            System.out.println("My thread is running");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class myThread2 extends Thread{
    public void run(){
        int i =0 ;
        while(i<5){
            System.out.println("Thread 2 is good");
            System.out.println("I am sad!");
            i++;
        }
    }
}


public class Threading {
    public static void main(String[] args) {
        myThread t1= new myThread();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();

    }
}
