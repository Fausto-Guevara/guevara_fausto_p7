/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Junio-2024 
 */
public class Main {
    public static void main(String[] args) {
        // Problema 1
        String str = "cbadef";
        System.out.println("Ordenamiento recursivo: " + LexicographicSort.insertionSortRecursive(str));
        System.out.println("Ordenamiento iterativo: " + LexicographicSortIterative.insertionSortIterative(str));
    }
}
