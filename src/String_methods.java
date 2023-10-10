public class String_methods {
    public static void main(String[] args) {
        String name = "Ankush";
        int value = name.length();
        System.out.println(value);

        String val = name.toLowerCase();
        System.out.println(val);

        String str = name.toUpperCase();
        System.out.println(str);

        String nonTrimmedString = "       Ankush     ";
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(2));

        System.out.println(name.substring(2,5));

        System.out.println(name.replace('k','t'));

        System.out.println(name. replace("An", "Pan"));

        System.out.println(name.startsWith("an"));

        System.out.println(name.endsWith("h"));

        System.out.println(name.charAt(2));
        System.out.println("I am a escape sequence \"Ankush\", you know it");

    }
}
