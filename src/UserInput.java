import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number 1 : ");
//        int a = sc.nextInt();
//        System.out.print("Enter number 2 : ");
//        int b = sc.nextInt();
//        int sum = a + b;
//        System.out.print("The sum of these numbers is : " + sum);
//
//        boolean b1= sc.hasNextInt();
//        System.out.println(b1);
        String str =sc.next();
        System.out.println(str);
    }
}
