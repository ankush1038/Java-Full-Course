class Mythre extends Thread{
    public Mythre(String name){
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

public class Thread_Priorities {
    public static void main(String[] args) {
        Mythre q1 = new Mythre("Ankush1");
        Mythre q2 = new Mythre("Ankush2");
        Mythre q3 = new Mythre("Ankush3");
        Mythre q4 = new Mythre("Ankush4");
        Mythre q5 = new Mythre("Ankush5");
        q1.start();
        q2.start();
        q3.start();
        q4.start();
        q5.start();
    }
}
