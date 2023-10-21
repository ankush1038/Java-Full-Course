 class MyEmployee{
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
}

public class Access_Modifiers {
    public static void main(String[] args) {

        MyEmployee ankush = new MyEmployee();
//        ankush.id= 1038;
//        ankush.name= "Ankush Sharma"; Throws error due to private access  modifier
        ankush.setName("Ankush");
        System.out.println(ankush.getName());

    }
}

