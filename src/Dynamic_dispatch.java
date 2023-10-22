class Phone{
    public void greet(){

        System.out.println("Good morning");
    }

    public void name(){
        System.out.println("My name is Java");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void swagat() {
        System.out.println("Aapka swagat hai");
    }
    public void name(){
        System.out.println("My name is Java in class two");
    }
}

public class Dynamic_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        obj.greet();
//        obj.name();

        Phone obj1 = new SmartPhone();
        SmartPhone obj = new SmartPhone();
        obj1.name();
//        obj1.music();
        obj.swagat();

//        SmartPhone obj2 = new Phone(); Not allowed

    }
}
