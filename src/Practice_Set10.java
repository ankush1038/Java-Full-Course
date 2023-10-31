import java.util.Scanner;

public class Practice_Set10 {
    public static void main(String[] args) {
        try{
            int a = 666/0;
        }catch(IllegalAccessError e){
            System.out.println("Ha Ha");
        }catch(ArithmeticException e){
            System.out.println("He He");
        }
        boolean flag = true;
        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 37;
        marks[2] = 74;
        marks[3] = 72;
        marks[4] = 71;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try {
                System.out.println("Enter the vaue of Index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }catch (Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }

}
