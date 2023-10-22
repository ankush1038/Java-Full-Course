import org.w3c.dom.ls.LSOutput;

class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    Base1(int s){
        System.out.println("I am a base class constructor with value of s as " + s);
    }
}
class Derived1 extends Base1{
    Derived1(){
//        super(38);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(69);
        System.out.println("I am an overloaded constructor with value of y : "+ y);
    }
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
class Child_of_Derived extends Derived1{
    Child_of_Derived() {
        System.out.println("I am a child of derived constructor");
    }
    Child_of_Derived(int x, int y, int z){
        super(x,y);
        System.out.println("Value of z is " + z);
    }
}


public class Constructors_Inheritence {
    public static void main(String[] args) {
//        Base1 x = new Base1();
//        Derived1 y =new Derived1(38,75);
        Child_of_Derived w = new Child_of_Derived(38,75,70);
    }
}
