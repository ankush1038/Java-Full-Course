public class Practice_Set4 {
    public static void main(String[] args){
//        float[] arr = {42.5f, 23.5f, 69.9f, 78.6f, 11.9f };
//        float num =43.5f;
//        boolean IsPresent = false;
//        for(float element: arr){
//            if(num==element){
//                IsPresent = true;
//                break;
//            }
//
//        }
//        if(IsPresent){
//            System.out.println("Element is Present in the Array");
//        }
//        else{
//            System.out.println("Element is not present in the Array");
//        }

        // Problem 3
//        float[] arr = {42.5f, 23.5f, 69.9f, 78.6f, 11.9f };
//        float sum =0;
//        for(float element : arr){
//            sum += element;
//        }
//        System.out.println("The average of mark is " + sum/arr.length);

        // Problem 4
//        int [][] mat1 = {{1,2,3},{4,5,6}};
//        int [][] mat2 = {{2,6,13},{3,7,1}};
//        int [][] result = {{0,0,0},{0,0,0}};
//        for(int i=0;i<mat1.length;i++){
//            for(int j=0;j<mat1[i].length;j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println("\n");
//        }
        // Problem 5
//        int arr[] = {1,2,3,4,5,6};
//        int l =arr.length;
//        int  n =Math.floorDiv(l, 2);
//        int temp;
//        for( int i=0;i<n; i++ ){
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for(int element : arr){
//            System.out.print(element + " ");
//        }

        // Problem 6
//        int a[] = {1,2,3,4,5,65,4};
//        int max = 0;
//        for(int e : a){
//            if(e>max){
//                max = e;
//
//            }
//
//        }
//        System.out.print(max);

        // Problem 7
        int a[] = {1,2,3,4,5,6,7};
        boolean isSorted = true;
        for(int i=0;i<a.length-1;i++){
            if(a[i] >a[i+1]){
                isSorted = false;
            }
        }
        if(isSorted){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}
