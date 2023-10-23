abstract class Parent{
    public Parent(){
        System.out.println("I am Parent Constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child extends Parent{

    public void greet(){
        System.out.println("Konichiva");
    }
}
abstract class Child2 extends Parent{
    public void hi(){
        System.out.println("I am good");
    }
}

public class Abstract {
    public static void main(String[] args) {
       // Parent p = new Parent();  Error(Not Allowed)
       // Child2 c1 = new Child();  Error(Not Allowed)
        Child c = new Child();
        c.greet();
    }
}
