package one_Math;

import java.util.ArrayList;

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

    //  https://leetcode.com/problems/complement-of-base-10-integer/submissions/
    public static int bitwiseComplement(int n) {
        System.out.println(Integer.toBinaryString(n));
        double ans = 0;
        double count = 0;

        if(n==0){return 1 ;}

        while (n > 0) {

            int a = n & 1;
            System.out.println(" -- " + a);
            a = a ^ 1;

            ans = ans + a *Math.pow(2 ,count);
            count ++;
            n = n >> 1 ;
        }
        return (int)ans;

    }
    public static int bitwiseComplement1(int n) {

        if(n==0){return 1 ;}

        int result = 0 ,factor = 1;
        while(n>0){

            result += factor*(n%2==0 ? 1 :0);
            factor*=2;
            n/=2;

        }

        return result;

    }

    // if we write 5 in binary the length of number is going to be -----> Integer.toBinaryString(n).length()) ---> 101(3)
    //    if we left shift 1 << 3 ==>  1000 ; now 1000 - 1 == 111 ---> xOR 111^101
    public static int bitwiseComplement2(int n) {
        return (n == 0 ? 1 : ((1<<Integer.toBinaryString(n).length()) - 1)^n);
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
    public static double squareRoot(int target, int p) {

        int start = 1;
        int end = target - 1;
        // RAns == round off answer
        double RAns = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            RAns = mid;
            if (mid * mid == target) {
                return mid;
            }
            if (mid * mid > target) {
                end = mid - 1;
            } else start = mid + 1;

        }

        System.out.println(RAns);

        double increment = 0.1;
        for (int i = 0; i < p; i++) {

            while (RAns * RAns <= target) {
                RAns = RAns + increment;
            }
            RAns = RAns - increment;
            increment /= 10;

        }

        return RAns;
    }


    //  Newton Raphson  Method for sqrt
    public static double NewtonRaphsonMethodForSqrt(double target) {

        double x = target;
        double root;
        while (true) {

            root = (x + target / x) * 0.5;
            if (Math.abs(root - x) < 0.00001) {
                break;
            }
            x = root;
        }
        return root;
    }


    // ---------------------==================------------------------====================-----------------=================-------------


    // Factors Of A Number
    // Factors of 20 --- > the numbers which divide 20 and gives remainder Zero
    //  Factors of 20  ----> 1, 2, 4, 5, 10, 20 ;
    public static void factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i + " ");
                } else {
                    System.out.println(i + " " /* + n / i */);
                    list.add(n / i);
                }
            }
        }
        for (int i = list.size() - 1; 0 <= i; i--) {
            System.out.println(list.get(i) + " ");
        }
    }


    // ---------------------==================------------------------====================-----------------=================-------------

//  HCF of two numbers
//                        |----> 1, 2, 3, 4, 6, 12
    //    HCF ( 4 , 18 )  =  6 ;
    //              |----> 1, 2, 3, 6

    public static int hcf(int a, int b) {
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        if (a == 0) {
            return b;
        }
        return hcf(b % a, a);
    }


    // ---------------------==================------------------------====================-----------------=================-------------

    // LCM of two numbers
    //  LCM = [ a * b  /  HCF ( a, b ) ]

    public static int lcm (int a , int b ){

        if (a == 0) {
            return a*b/b;
        }
        return hcf(b % a, a);

    }


}