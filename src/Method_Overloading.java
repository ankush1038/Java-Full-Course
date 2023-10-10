public class Method_Overloading {
//    static void tellJoke(){
//        System.out.println("I am invented a new word");
//    }
//
////    static void change(int a){
////        a = 98;
////    }
//    static void change2(int[] marks){
//        marks[0] = 98;

    static void foo(){
        System.out.println("Good morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good morning Bro! " + a);
    }
    static void foo(int a, int z){
        System.out.println("Good morning "+ a + " and " + z + " brothers");
    }

    public static void main(String[] args) {
//        tellJoke();
//        int[] arr = {52, 73 ,77,89,98,94};
////        int x =45;
////        change(x);
////        System.out.println("The value of x after running change is : "  +x);
//
//        change2(arr);
//        System.out.println(arr[0]);
        int z =3000;
        int a= 10;
        int c =30;
        foo();
        foo(z);
        foo(a,c);
    }
}
