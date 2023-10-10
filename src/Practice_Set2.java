import java.util.Locale;

public class Practice_Set2 {
    public static void main(String[] args) {
        // Problem 1
        String str = "ANKUSH SHARMA";
        str = str.toLowerCase();
        System.out.println(str);

        // Problem 2

        String txt = "To Lower Case";
        txt = txt.replace(" ", "_");
        System.out.println(txt);

        //Problem 3
        String letter = "Dear name, Thanks a lot";
        letter = letter.replace("name", "Ankush");
        System.out.println(letter);

        // Problem 4

        String my = "This string contains double  and triple   spaces";
        System.out.println(my.indexOf("  "));
        System.out.println(my.indexOf("   "));

        // Problem 5
        String letter2 = "Dear Ankush, \n\tThis Java is Course is nice. \n\tThanks!";
        System.out.println(letter2);

    }
}
