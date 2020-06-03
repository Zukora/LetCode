package sorting;

public class SortingByInclusion {
    private static int[] inclusionSort(int[] unsortArray) {
        if (unsortArray.length < 2) {
            return unsortArray;
        }
        for (int i = 1; i < unsortArray.length; i++) {
            int key = unsortArray[i];
            for (int j = i - 1; j >= 0; j--) {
                if (key < unsortArray[j]) {
                    swapElement(unsortArray, j, j + 1);
                }
            }
            System.out.print(String.format("index = %s, key = %s, array after sort : ", i, key));
            printArray(unsortArray);
        }
        return unsortArray;
    }

    private static void swapElement(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] myarray = new int[]{7, 3, 8, 4, 5, 6, 9, 1, 2};
        System.out.println("unsorted arrayy");
        printArray(myarray);
        System.out.println("Sorting steps...");
        System.out.println("--------------------");
        inclusionSort(myarray);
        System.out.println("--------------------");
        System.out.println("Sort finish...");
    }
}
