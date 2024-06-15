/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Junio-2024 
 */
public class MenorPalindromoTest {

    public static void main(String[] args) {
        // Casos de prueba
        String[] testCases = {
            "naan", "abba", "racecar", "civic", "mom", "madam", "level", "rotator", "aa"
        };

        // Probar recursión
        System.out.println("Pruebas con recursión:");
        for (String testCase : testCases) {
            String result = MenorPalindromoRecursion.menorPalindromo(testCase);
            System.out.println("Original: " + testCase + ", Menor palíndromo: " + result);
        }

        // Probar do-while
        System.out.println("\nPruebas con do-while:");
        for (String testCase : testCases) {
            String result = MenorPalindromoDoWhile.menorPalindromo(testCase);
            System.out.println("Original: " + testCase + ", Menor palíndromo: " + result);
        }

        // Probar while
        System.out.println("\nPruebas con while:");
        for (String testCase : testCases) {
            String result = MenorPalindromoWhile.menorPalindromo(testCase);
            System.out.println("Original: " + testCase + ", Menor palíndromo: " + result);
        }
    }
}
