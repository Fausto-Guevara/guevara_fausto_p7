/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Junio-2024 
 */
public class LexicographicSortIterative {
    public static String insertionSortIterative(String str) {
        char[] arr = str.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            char key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return new String(arr);
    }
}
