class Circle{
    Circle(int x){
        this.radius = x;
        System.out.println(" I am a circle parameterised constructor");
    }
    int radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    Cylinder1(int h, int r){
        super(r);
        System.out.println(" I am a Cylinder parameterised constructor");
        this.height = h;
    }
    public int height;

    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }

}

public class Practice_Set7 {
    public static void main(String[] args) {
            //Circle obj = new Circle(12);
        Cylinder1 cy = new Cylinder1(2,3);
    }
}
