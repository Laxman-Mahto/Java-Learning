package SOLVEDQUES;

public class arrayy29prac {
    public static void main(String[] args) {
        //prob 1
       /* float[] marks = {23.4f,23.1f,54.1f,2.0f,32.3f};
        float sum = 0;
        for(float element:marks){
            sum = sum+element;
        }
        System.out.println("The value of sum is " + sum); */

        int[] numbers = {23, 23, 64, 74, 23, 43, 75, 342, 13};
        int num = 2;
        boolean isInArray = false;
        for (int element : numbers) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("THE VALUE IS PRESENT IN ARRAY");
        } else {
            System.out.println("value in not there in array");
        }

        //prob 3
//        int [] mark={2,3,4,5,6,7,8,9,9};
//        int sum=0;
//        for(int element:mark){
//            sum = sum+element;
//
//        }
//        System.out.println();


        //problem 4
//        int[][] mat1 = {{2, 3, 4},
//                {4, 5, 6}};
//        int[][] mat2 = {{1, 6, 4},
//                {2, 4, 8}};
//        int[][] total = {{0, 0, 0},
//                {0, 0, 0}};
//        for (int i = 0; i < mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.format("the setting value for i=%d and j%d\n", i, j);
//                total[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        for (int i = 0; i < mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.print(total[i][j] + " "); //printing total and for space between two digit used ""
//                total[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(" "); // to print new line
//        }
        
//        // prob 5 very imp.
//        int [] arr={1,2,3,4,5,6,7};
//        int l=arr.length;
//        int n=Math.floorDiv(l,2);
//        int temp;
//
//        for(int i=0;i<n;i++) {
//            temp = arr[i];
//            arr[i] = arr[l - 1 - i];
//            arr[l - 1 - i] = temp;
//            //from this we get answer in reverse order
//        }
//        for(int element:arr){
//           System.out.print(element+ " ");
//            System.out.println(element);
//        }

//        //prob 6
//        int [] arr = {1,2,3,4,5,6,7};
//        int max =0;
//        for(int e: arr){
//            if(e>max){ //e means element
//                max=e;
//            }
//        }
//        System.out.println("the maximun value of the aray is :" + max);

        // 8 java progrqam to check array is sorted or not
        int []arr={1,2,3,6,34,85,86};
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
            if(isSorted){
                System.out.println("array is sorted");
            }
            else{
                System.out.println("array is not sorted");

            }

        }
    }
}

