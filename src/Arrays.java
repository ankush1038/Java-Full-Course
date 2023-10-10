public class Arrays {
    public static void main(String[] args) {
        /*float [] marks = new float[5];
        marks[0]=100;
        marks[1]=70;
        marks[2]=60;
        marks[3]=20;
        marks[4]=80;
        System.out.println(marks[2]);
        String[] students = {"Ankush", "Sharma", "is", "a" , "good", "person"};
        System.out.println(students[3]); */

        // Printing in reverse order
       /* int [] marks = {98,97,96,95,94};
//        for(int i=marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }
            for(int element: marks){
                System.out.println(element);
            }*/
        // 2-D Arrays

        int [][] flats;
        flats = new int[2][3];
        flats[0][0]= 101;
        flats[0][1]= 102;
        flats[0][2]= 103;
        flats[1][0]= 201;
        flats[1][1]= 202;
        flats[1][2]= 203;

        for(int i=0;i<flats.length;i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
