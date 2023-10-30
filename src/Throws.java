class NegativeException extends Exception{
    public String toString(){
        return "Radius cannot be negative";
    }
}

public class Throws {
    public static double area(int r) throws NegativeException{
        if(r<0){
            throw new NegativeException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a / b;
        return result;
    }
    public static void main(String[] args) {
        try {
//            int c = divide(6, 0);
//            System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        }catch (Exception e){
            System.out.println("Exception");
        }

    }
}
