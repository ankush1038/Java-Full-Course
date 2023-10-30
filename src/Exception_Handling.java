public class Exception_Handling {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("he result is " + c);
        }catch(Exception e){
            System.out.println("We failed to divide");
            System.out.println(e);
        }
        System.out.println("End of Program");
    }

}
