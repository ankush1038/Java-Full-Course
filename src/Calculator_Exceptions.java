import javax.naming.CannotProceedException;

class InvalidInputException extends Exception{
    public  String toString(){
     return "Cannot perform operation on 8 and 9";
    }
    public String toMessage(){
        return "Cannot perform Operation";
    }
}
class CannotDivideByZeroException extends Exception{
    public  String toString(){
     return "Cannot Divide by zero";
    }
    public String toMessage(){
        return "Cannot perform Operation";
    }
}



class CustomCalculator {
    double add(double a, double b) throws InvalidInputException{
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }double sub(double a, double b){
        return a-b;
    }double mul(double a, double b){
        return a*b;
    }double div(double a, double b) throws CannotDivideByZeroException{
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}

public class Calculator_Exceptions {
    public static void main(String[] args) throws InvalidInputException,CannotDivideByZeroException{
        CustomCalculator c = new CustomCalculator();
//        c.add(8,9);
        c.div(56,0);
    }
}
