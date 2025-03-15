package com.liqiang.learn;

public class func7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newArr = copyArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i] == newArr[i]) + " ");
        }
        System.out.println();

    }

    public static int[] copyArray(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
