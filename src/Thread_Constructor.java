class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run() {
        int i = 10;
        System.out.println("Thank you");
//        while (true) {
//            System.out.println("I am a Thread");
//
//        }
    }
}


public class Thread_Constructor {
    public static void main(String[] args) {
        Mythr g = new Mythr("Ankush");
        Mythr a = new Mythr("Ram Chandra");
        g.start();
        System.out.println("The Id of thread is : " + g.getId());
        System.out.println("The Id of thread is : " + a.getId());
        System.out.println("The Id of thread is : " + g.getName());
        System.out.println("The Id of thread is : " + a.getName());
    }
}
