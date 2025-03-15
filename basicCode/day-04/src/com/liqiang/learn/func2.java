package com.liqiang.learn;

public class func2 {
    public static void main(String[] args) {
        int[] a = {11,22,33,44,55};
        int[] b = {1,2,4,5,6,7,8,9};
        printArray(a);
        printArray(b);
        maxArray(a);
        maxArray(b);
        System.out.println(inArray(a,10));
        System.out.println(copyOfRange(a,2,5));
        printArray(copyOfRange(b,3,7));
    }


    public static int[] copyOfRange(int[] arr,int from ,int to){

        int [] res = new int[to-from];
        for (int i = from; i < to; i++) {
            res[i-from] = arr[i];
        }
        return res;




    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void maxArray(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            max = max > a[i] ? max: a[i];
        }
        System.out.println(max);
    }


    public static boolean inArray(int[] a ,int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return true;
            }
        }
        return false;
    }
}
