class A{
    public int Ankush(){
        return 38;
    }
    public void Ankush1(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    public void Ankush1(){
        System.out.println("I am method 2 of class B");
    }
    public void Ankush2(){
        System.out.println("I am method 3 of class A");
    }
}

public class Method_OverrRiding {
    public static void main(String[] args) {
        A x = new A();
        x.Ankush1();

        B b =new B();
        b.Ankush1();
    }
}
