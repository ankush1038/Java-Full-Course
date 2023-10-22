class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x){
        System.out.println("I am setting x now");
        this.x=x;
    }
    public void print(int x){
          System.out.println("I am a constructor");
    }
}

class derived extends Base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println();
        System.out.println("I a setting value of y now");

        this.y= y;
    }
}

public class Inheritence {
    public static void main(String[] args) {

        derived b = new derived();
        b.setX(4);
        System.out.println("Value of x : " + b.getX());
        b.setY(69);
        System.out.println("Value of y :  " + b.getY());
        Base n = new Base();
        n.setX(38);
        System.out.println("The value of n : " + n.getX());
    }
}
