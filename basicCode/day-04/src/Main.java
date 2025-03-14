import java.util.Random;

public class Main {
    public static void main(String[] args) {
        func1();
        System.out.println();
    }

    public static void func1(){
        Random r = new Random();
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int n = r.nextInt(5);
            arr[i] = arr[n];
            arr[n] = tmp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}