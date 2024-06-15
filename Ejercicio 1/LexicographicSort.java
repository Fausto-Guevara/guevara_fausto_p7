/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Junio-2024 
 */
public class LexicographicSort {
    public static String insertionSortRecursive(String str) {
        char[] arr = str.toCharArray();
        insertionSortRecursive(arr, arr.length);
        return new String(arr);
    }

    private static void insertionSortRecursive(char[] arr, int n) {
        if (n <= 1) {
            return;
        }
        insertionSortRecursive(arr, n - 1);
        char last = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }
}
