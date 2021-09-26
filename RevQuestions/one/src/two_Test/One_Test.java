package two_Test;

import java.util.ArrayList;
import java.util.Arrays;

public class One_Test {

    public static void main(String[] args) {


       // int arr[] = {5,1,3};
         int arr [] = {2,3,3,4,2,6,4};

        System.out.println(ans1(arr));
    }



    public static int ans1(int arr[]) {

        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }






}





