class MyMainEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setID(int i){
        id=i;
    }
    public int getID(){
        return id;
    }

    public MyMainEmployee(String myname, int myId){
        id = myId;
        name  = myname;
    }
    public MyMainEmployee(){
        id = 38;
        name  = "Your name";
    }
}


public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee ankush = new MyMainEmployee("Ankush Sharma", 38);
        MyMainEmployee anku = new MyMainEmployee();

        System.out.println(ankush.getID());
        System.out.println(ankush.getName());
        System.out.println(anku.getID());
        System.out.println(anku.getName());
    }
}
