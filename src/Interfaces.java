interface Bicycle{
    int a=38;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void wlowHorn();
    void vlowHorn();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Beep");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brakes");
    }
    public void speedUp(int increment){
        System.out.println("Speeding Up");
    }

    public void wlowHorn(){
        System.out.println("Beep Beep");
    }
    public void vlowHorn(){
        System.out.println("Beep Beep Beep");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle a = new AvonCycle();
        //Bicycle b = new Bicycle();

        a.blowHorn();
        a.applyBrake(3);
        System.out.println(a.a);
        //You cannot modify properties in an interface
//        a.a= 75;
        a.vlowHorn();
        a.wlowHorn();
    }

}
