class C1{
    public int x = 5;
    protected int y = 69;
    int z = 38;

    private int a = 75;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class Access_Modifierss {
    public static void main(String[] args) {
        C1 c = new C1();
        //c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a); // Cannot use in same package becaise of private Access Modifiers
    }
}
