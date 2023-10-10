import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eng = sc.nextInt();
        int maths = sc.nextInt();
        int sst = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int sum = (eng + maths + sst + physics + chemistry)/5;
        System.out.println("Percentage : " + sum);
        sc.close();
    }

}
