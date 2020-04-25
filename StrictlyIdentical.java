
import java.io.*;
import java.util.*;

class StrictlyIdentical {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //Prompt user to enter 5 numbers
        System.out.print("Enter 5 elements of list1: ");
        String list1 = sc.nextLine();

        String[] array1 = list1.split(" ");
        int[] arr1 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = Integer.parseInt(array1[i]);
        }
    //Prompt user to enter 5 numbers
        System.out.print("Enter 5 elements of list2: ");
        String list2 = sc.nextLine();
        System.out.println();

        String[] array2 = list2.split(" ");
        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr2[i] = Integer.parseInt(array2[i]);
        }
    // If two sets of numbers are equal, return Yes if not then return No
        if (areEqual(arr1, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean areEqual(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        // If lengths of array are not equal return false
        if (n != m) {
            return false;
        }

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare elements
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}
