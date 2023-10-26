interface  sampleIntrface{
    void meth1();
    void meth2();
}
interface childInterface extends sampleIntrface{
    void meth3();
    void meth4();
}

class sampleClass implements childInterface{
    public void meth3(){
        System.out.println("Method 3");
    }
        public void meth4(){
        System.out.println("Method 4");
    }
    public void meth1(){
        System.out.println("Method 1");
    }
    public void meth2(){
        System.out.println("Method 2");
    }
}

public class Inheritence_Interfaces {
    public static void main(String[] args) {
        sampleClass n = new sampleClass();
        n.meth1();
        n.meth2();
        n.meth3();
        n.meth4();
    }
}
