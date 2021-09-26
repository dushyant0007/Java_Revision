package one;

public class One {

    public static void main(String[] args) {

        // int[] arr = {3, 5, 74, 3, 4, 36, 34, 23, 2, 7};
        //        System.out.println(Arrays.toString(Search(arr, 34)));

        // String name = "Bikaner";
        // System.out.println(SearchInString(name,'e'));
        //System.out.println(SearchInRange(name, 'n', 0, 4));

        int[] arr = {1, 2, 4, 6, 8, 12, 17, 15, 13, 8, 6, 3};
        int[] b = {4, 5, 6, 7, 3, 2, 1, 0}; //
        System.out.println(peakOfMountain(arr));


    }

    // ---------------------==================------------------------====================-----------------=================-------------

    // Linear Search in array , return index and value
    public static int[] Search(int arr[], int target) {

        int[] rtn = new int[2];
        rtn[0] = -1;
        rtn[1] = -1;

        if (arr.length == 0) {
            return rtn;
        }
        int index = 0;
        for (int value : arr) {

            if (value == target) {

                rtn[0] = value;
                System.out.println(" The target element is found on index = " + rtn[1]);
                return rtn;
            }
            index++;
            rtn[1] = index;
        }
        System.out.println(" The target element is not found ");
        return rtn;
    }

    // ---------------------==================------------------------====================-----------------=================-------------


    // Search in string
    public static int SearchInString(String str, char target) {

        if (str.length() == 0) {
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                System.out.println("The Char is found in the string");
                return i;
            }
        }
        return -1;
    }

    // ---------------------==================------------------------====================-----------------=================-------------

    // Searching in string in range
    public static int SearchInRange(String str, char target, int startIndex, int endIndex) {

        if (str.length() == 0) {
            return -1;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            if (target == str.charAt(i)) {
                System.out.println("The element is found in the range");
                return i;
            }
        }
        System.out.println(" The element is not found in the range");
        return -1;
    }

    // ---------------------==================------------------------====================-----------------=================-------------

    // Maximum value in a array
    public static int MaxValue(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > ans) {
                ans = j;
            }
        }
        return ans;
    }

    // ---------------------==================------------------------====================-----------------=================-------------


    // Search in 2D Array
    public static int[] SearchInArray(int arr[][], int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; i < arr[i].length; i++) {
                if (target == arr[i][j]) {
                    System.out.println("Element if found in Array");
                    return new int[]{i, j};
                }

            }

        }
        System.out.println("Element is not found in Array ");
        return new int[]{-1, -1};
    }

    // --------------##########------------------------###########-----------------##########-------------

    // Max in 2D Array
    public static int MaxIn2D(int arr[][], int target) {

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; i++) {

                if (ans < arr[i][j]) {
                    ans = arr[i][j];
                }

            }

        }
        return ans;
    }

    // ---------------------==================------------------------====================-----------------=================-------------


    // find numbers of even number of digits in an int array
    //  example   123 -> 3digits (odd) , 4729  --> 4 digits (even)

    // Number of digits --- int ttr = 2344452  <--->  (int)(Math.log10(ttr)) + 1
    public static int evenNumberOfDigits(int[] arr) {
        int ans = 0;

        for (int a : arr) {

            if (a < 0) {
                a = a * -1;
            }

            int count = 0;

            while (a > 0) {
                a = a / 10;
                count++;
            }
            if (count % 2 == 0) {
                ans++;
            }
        }

        System.out.println(ans);
        return ans;

    }

    // ---------------------==================------------------------====================-----------------=================-------------


    public static int maxSumOfRowElements(int[][] arr) {

        int ans = Integer.MIN_VALUE;

        for (int row[] : arr) {
            int sum = 0;
            for (int col : row) {

                sum = sum + col;
                if (sum > ans) {
                    ans = sum;
                }
            }
        }
        return ans;
    }


    // ---------------------==================------------------------====================-----------------=================-------------


    // Binary Search return index
    public static int binarySearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start > end) {

            int mid = start + (end - start) / 2;

            if (arr[0] <= arr[1]) {

                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] == target) {
                    return mid;
                }
            } else {

                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] == target) {
                    return mid;
                }
            }

        }

        System.out.println("Element is not found in array");
        return -1;

    }

    // ---------------------==================------------------------====================-----------------=================-------------


    // for floor value replace return arr[start] ; to return end [ end ] ;
    public static int binarySearchCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return arr[start];
    }

    // ---------------------==================------------------------====================-----------------=================-------------


    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    // return smallest character in the array which is larger than target
    public static int smallestChar(char[] arr, char target) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else end = mid - 1;
        }
        return arr[start % arr.length];
    }


    // ---------------------==================------------------------====================-----------------=================-------------


    //  https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


    // ---------------------==================------------------------====================-----------------=================-------------


// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

//  Searching In Infinite Array

    public static int searchingInInfiniteArray(int arr[], int target) {

        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = start;
            start = end + 1;
            end = (end + end - temp + 1) * 2;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int arr[], int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else return mid;

        }
        return -1;
    }

    // ---------------------==================------------------------====================-----------------=================-------------

    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    // https://leetcode.com/problems/find-peak-element/
    // Peak Of Mountain


    public static int peakOfMountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start; // or return end as both are =
    }


    // ---------------------==================------------------------====================-----------------=================-------------


    // https://leetcode.com/problems/find-in-mountain-array/

    public static int search(int[] arr, int target) {
        int peak = peakOfMountain(arr);
        int partOne = binarySearch(arr, target, 0, peak);

        if (partOne != -1) {
            return partOne;
        }

        return binarySearch(arr, target, peak + 1, arr.length - 1);

    }
    public static int peakOfMountain1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start; // or return end as both are =
    }
    public static int binarySearch1(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start > end) {

            int mid = start + (end - start) / 2;

            if (arr[0] <= arr[1]) {

                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] == target) {
                    return mid;
                }
            } else {

                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] == target) {
                    return mid;
                }
            }

        }

        System.out.println("Element is not found in array");
        return -1;

    }

    // ---------------------==================------------------------====================-----------------=================-------------

    // https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/

    static int search2(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch2(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch2(nums, target, 0, pivot - 1);
        }

        return binarySearch2(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch2(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    // this will not work in duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }



    // ---------------------==================------------------------====================-----------------=================-------------








}



