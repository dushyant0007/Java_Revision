package three_New;

import java.util.Arrays;

public class One {

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(12));

        System.out.println(12 & (-12));

    }


    // ---------------------==================------------------------====================-----------------=================-------------

    // If number is odd return true else false
    public static boolean isOdd(int num) {
        return (num & 1) == 1;
    }

    // ---------------------==================------------------------====================-----------------=================-------------

    // https://leetcode.com/problems/single-number/submissions/
    // There is an array where every number is appearing twice accept one number , find that one number
    //  int arr [] = {2,3,3,4,2,6,4};

    public static int ans1(int arr[]) {

        int unique = 0;
        for (int n : arr) {
            unique = unique ^ n;
        }
        return unique;
    }


    // ---------------------==================------------------------====================-----------------=================-------------


    // Finding nth magic number

    public static int magicNumber(int n) {

        int ans = 0;
        int base = 5;
        while (n > 0) {

            int last = n & 1;
            n = n >> 1;
            ans = ans + last * base;
            base = base * 5;

        }

        return ans;
    }


    // ---------------------==================------------------------====================-----------------=================-------------

    //   Number of digits in binary

    public static int numOfDigitsInBinary(int n) {

        return (int) (Math.log10(n) / Math.log10(2)) + 1;

    }


    // ---------------------==================------------------------====================-----------------=================-------------

    // pascal's triangle
    // sum of nth row

//             1
//             1  1
//             1  2  1
//             1  3  3  1
//             1  4  6  4  1
//             1  5  10  10  5  1
//             1  6  15  20  15  6  1


    public static int sumOfNthRow(int n) {

        return 1 << (n - 1);

    }


    // ---------------------==================------------------------====================-----------------=================-------------

    ///     finding if the number is in power of two or not

    public static boolean isInPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else if ((n & (n - 1)) == 0) {
            return true;
        } else return false;

    }

    // ---------------------==================------------------------====================-----------------=================-------------

    // Finding no. of set bits

    public static int noOfSetBits(int n) {

        int count = 0;

        while (n < 0) {
            count++;
            n = n - (n & (-n));

        }

        return count;
    }

    // ---------------------==================------------------------====================-----------------=================-------------

    // xOR from  a to b ;

    public static int xOR(int a) {

        if (a % 4 == 0) {
            return a;
        } else if (a % 4 == 1) {
            return 1;
        } else if (a % 4 == 2) {
            return a + 1;
        } else {
            return 0;
        }

    }

    public static int xORInRange(int a, int b) {

        return xOR(b) ^ xOR(a - 1);

    }


    // ---------------------==================------------------------====================-----------------=================-------------


    // https://leetcode.com/problems/flipping-an-image/

    public static int[][] flippingAnImage(int arr[][]) {


        for (int[] i : arr) {

            flipTheArray(i);
            for (int j = 0; j < i.length; j++) {
                i[j] = i[j] ^ 1;
            }

        }

        return arr;
    }

    private static void flipTheArray(int[] i) {

        int start = 0;
        int end = i.length - 1;

        while (start <= end) {

            int temp = i[start];
            i[start] = i[end];
            i[end] = temp;

            start++;
            end--;
//            System.out.println("flip");
//            System.out.println(Arrays.toString(i));

        }


    }


    // ---------------------==================------------------------====================-----------------=================-------------

    // finding prime number between 0 and 40

//    public static void main(String[] args) {
//
//       int n = 40 ;
//    boolean [] primes = new boolean [ n + 1 ] ;
    //  //   The default values in the array are false
//   inBwPrime(n , primes);
//
//    }

    //  // false in array means is prime
    public static void inBwPrime(int n, boolean[] primes) {

        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; i++) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                System.out.println(primes[i]);
            }
        }

    }



    // ---------------------==================------------------------====================-----------------=================-------------

    //   Finding SquareRoot of a number

    public static double squareRoot( int target, int p) {

        int start = 1;
        int end = target - 1;
        // RAns == round off answer
        double RAns = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            RAns = mid;
            if (mid * mid == target){return mid;}
            if (mid * mid > target) {
                end = mid - 1;
            } else start = mid + 1;

        }

        System.out.println(RAns);

        double increment = 0.1;
        for ( int i = 0; i < p; i++) {

            while (RAns * RAns <= target) {
                RAns = RAns + increment;
            }
            RAns = RAns - increment ;
            increment /= 10 ;

        }

        return RAns;
    }

    // ---------------------==================------------------------====================-----------------=================-------------




}