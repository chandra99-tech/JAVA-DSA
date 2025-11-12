package Arrays;

import java.util.Arrays;

public class FindOutMaximumPrimeNumber {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 5, 9, 2, 6, 4, 2};

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));

        
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.println("Maximum Prime Number is: " + num);
                break; 
            }
        }
    }

    
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
