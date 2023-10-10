
 class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is : " + id);
        System.out.println("My name is : " + name);
        System.out.println("My salary is : " + salary);
        System.out.println();
     }
     public int getSalary(){
         return salary;
     }
}


public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        Employee Ankush = new Employee();
        Employee John = new Employee();


        Ankush.id = 1038;
        Ankush.name= "Ankush";
        Ankush.salary = 3000000;

        John.id = 1032;
        John.name = "John Thakur";
        John.salary = 9200;


//        System.out.println(Ankush.id);
//        System.out.println(Ankush.name);

        Ankush.printDetails();
        John.printDetails();
//        int salary = John.getSalary();
//        System.out.println(salary);

    }
}
