package two_Test;

import java.util.ArrayList;
import java.util.Arrays;

public class One_Test {

    public static void main(String[] args) {

        int arr [] [] =  {{1,1,0},{1,0,1},{0,0,0}};

        System.out.println(Arrays.toString(flippingAnImage(arr)));

    }



    public static int[][] flippingAnImage(int arr [][] ) {


        for (int [] i : arr){

            flipTheArray(i);
            System.out.println(" We are in flipping an image");
            System.out.println(Arrays.toString(i));
            for (int j = 0 ; j < i.length ; j++){
                i[j] = i[j]^1;
            }
            System.out.println(" after reversing the bit ");
            System.out.println(Arrays.toString(i));
        }

        return arr;
    }

    private static void flipTheArray(int[] i) {

        int start =  0 ;
        int end = i.length - 1;

        while (start<=end){

            int temp = i[start];
            i[start]= i[end];
            i[end] =temp;

            start++;
            end--;
//            System.out.println("flip");
//            System.out.println(Arrays.toString(i));

        }

    }






}





