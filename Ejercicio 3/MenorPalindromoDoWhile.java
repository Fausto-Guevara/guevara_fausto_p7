/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Junio-2024 
 */

public class MenorPalindromoDoWhile {

    public static String menorPalindromo(String s) {
        if (s == null || s.length() <= 1) return s;
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        boolean encontrado = false;

        do {
            if (chars[left] > 'a') {
                chars[left]--;
                chars[right] = chars[left];
                encontrado = true;
                break;
            }
            left++;
            right--;
        } while (left < right);

        if (!encontrado) return s;
        return new String(chars);
    }
}
