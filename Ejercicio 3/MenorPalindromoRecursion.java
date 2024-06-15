/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Junio-2024 
 */
public class MenorPalindromoRecursion {

    public static String menorPalindromo(String s) {
        if (s == null || s.length() <= 1) return s;
        char[] chars = s.toCharArray();
        if (!reducirPalindromo(chars, 0, chars.length - 1)) {
            return s;
        }
        return new String(chars);
    }

    private static boolean reducirPalindromo(char[] chars, int left, int right) {
        if (left >= right) return false;

        if (chars[left] > 'a') {
            chars[left]--;
            chars[right] = chars[left];
            return true;
        } else {
            boolean modificado = reducirPalindromo(chars, left + 1, right - 1);
            if (modificado) {
                chars[left] = chars[right] = 'z';
            }
            return modificado;
        }
    }
}

