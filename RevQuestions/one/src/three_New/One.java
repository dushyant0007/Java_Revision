package three_New;

public class One {

    public static void main(String[] args) {


    }


    // ---------------------==================------------------------====================-----------------=================-------------

    // If number is odd return true else false
    public static boolean isOdd(int num) {
        return (num & 1) == 1;
    }

    // ---------------------==================------------------------====================-----------------=================-------------

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

    public static int numOfDigitsInBinary(int n){

        return (int)(Math.log10(n)/Math.log10(2)) + 1 ;

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


    public static int sumOfNthRow(int  n) {

        return 1 << (n-1);

    }


    // ---------------------==================------------------------====================-----------------=================-------------

  ///     finding if the number is in power of two or not

    public static boolean  isInPowerOfTwo (int n){

        if ( (n & (n-1)) == 0 ){return true;}
        else return false;

    }


}
