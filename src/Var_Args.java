public class Var_Args {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
    static  int sum(int ...arr){
//        int [] a;
        int res =0;
        for(int a: arr){
            res +=a;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("The sum of a and b is : " + sum(4,5));
        System.out.println("The sum of a, b and c is : " + sum(4,5,6));
        System.out.println("The sum of a and b is : " + sum(3,4,5,6));

    }
}
