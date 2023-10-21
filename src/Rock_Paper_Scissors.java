import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for scissors");
        System.out.print("Enter your choice : ");
        int userInput = sc.nextInt();

        Random ran = new Random();
        int comInput = ran.nextInt(3);
        System.out.println("Computer choice : " + comInput);

        if(userInput == comInput){
            System.out.println("Draw");
        } else if (userInput == 0 && comInput == 2 || userInput ==1 && comInput == 0 || userInput == 2 && comInput == 1 ) {
            System.out.println("You win");
        }
        else{
            System.out.println("Computer wins");
        }

    }
}
