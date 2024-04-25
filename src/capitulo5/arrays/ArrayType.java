package capitulo5.arrays;

import java.util.Arrays;

public class ArrayType {
    public static void main(String[] args) {
        int[] myList = {3, 5, 2, 1};
        printArray(myList);
        reverse(myList);
        Arrays.sort(myList);
        for (int num : myList)
            System.out.println(num + " ");

        System.out.println(Arrays.binarySearch(myList, 3));
    }

    public static void printArray(int[] myList) {
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}
