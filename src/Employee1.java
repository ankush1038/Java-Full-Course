public class Employee1 {

    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
    public static void main(String[] args) {
        //Problem 1
        Employee1 Ankush = new Employee1();
        Ankush.setName("CodeWithHarry");
        Ankush.salary = 300000;
        System.out.println(Ankush.getName());
        System.out.println(Ankush.getSalary());
    }
}



