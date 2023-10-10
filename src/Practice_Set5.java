public class Practice_Set5 {
// Problem 1
//    static void mul(int x){
//        for(int i=1;i<x;i++){
//            System.out.format("%d X %d = %d ", x,i,x*i);
//        }
//    }
//    public static void main(String[] args) {
//        mul(7);
//    }


    // Problem 2
//    static void pattern(int n){
//        for(int i=0;i<n;i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern(4);
//    }

    // Problem 3
//    static int sum(int n){
//        if(n==1){
//            return 1;
//        }
//        else{
//            return n + sum(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//       int c = sum(69);
//        System.out.println(c);
//    }

    // Problem 4
//    static void pattern2(int n){
//        for(int i=n;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//
//    public static void main(String[] args) {
//            pattern2(4);
//    }
//    static int fib(int x){
//        if(x==1){
//            return 0;
//        }
//        else if(x==2){
//            return 1;
//        }
//        else{
//            return fib(x-1) + fib(x-2);
//        }
//    }
//
//    public static void main(String[] args) {
//        int res= fib(7);
//        System.out.println( res);
//    }

    // Problem 6

//    static int avg(int ...arr){
//        int res = 0;
//        int sum = 0;
//        for(int a: arr){
//            sum += a;
//            res = sum/ arr.length;
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("The average of marks is : " + avg(5,5,5,5,5));
//    }

    // Problem 7
    static void pattern_rec(int n){

        if(n>0){
            pattern_rec(n-1);
            for(int i =0; i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
     pattern_rec(5);
    }
}

