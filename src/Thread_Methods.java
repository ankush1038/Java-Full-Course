class myclass extends Thread{

    public void run() {
        int i =1;
        while(i<5) {
            System.out.println("Thank you");
            i++;
//        while (true) {
//            System.out.println("I am a Thread");
//
//        }
        }
    }
}
class myclass2 extends Thread{

    public void run() {
        int i = 1;
        while(true) {
            System.out.println("Thank you again");
            i++;
//        while (true) {
//            System.out.println("I am a Thread");
//
//        }
        }
    }
}



public class Thread_Methods {
    public static void main(String[] args) {
        myclass c1 = new myclass();
        myclass2 c2 = new myclass2();
        c1.start();
        //c1.join(); // It will allow c2 to run onl when c1 has finished execution.
//        try{
//            c1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        c2.start();
    }
}
