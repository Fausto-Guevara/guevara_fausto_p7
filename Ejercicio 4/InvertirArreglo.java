/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 13-Junio-2024 
 */
import java.util.Arrays;

public class InvertirArreglo {

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        
        // Imprimir arreglo original
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        // Versión recursiva
        int[] invertidoRecursivo = arreglo.clone();
        invertirRecursivo(invertidoRecursivo, 0, arreglo.length - 1);
        System.out.println("Arreglo invertido recursivamente:");
        imprimirArreglo(invertidoRecursivo);

        // Versión con for
        int[] invertidoFor = invertirFor(arreglo);
        System.out.println("Arreglo invertido con for:");
        imprimirArreglo(invertidoFor);

        // Versión con for-each (usando copia)
        int[] invertidoForEach = invertirForEach(arreglo);
        System.out.println("Arreglo invertido con for-each:");
        imprimirArreglo(invertidoForEach);

        // Versión con while
        int[] invertidoWhile = invertirWhile(arreglo);
        System.out.println("Arreglo invertido con while:");
        imprimirArreglo(invertidoWhile);

        // Versión con do-while
        int[] invertidoDoWhile = invertirDoWhile(arreglo);
        System.out.println("Arreglo invertido con do-while:");
        imprimirArreglo(invertidoDoWhile);
    }

    // Método para imprimir un arreglo
    public static void imprimirArreglo(int[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

    // Invertir arreglo recursivamente
    public static void invertirRecursivo(int[] arreglo, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        int temp = arreglo[inicio];
        arreglo[inicio] = arreglo[fin];
        arreglo[fin] = temp;
        invertirRecursivo(arreglo, inicio + 1, fin - 1);
    }

    // Invertir arreglo con for
    public static int[] invertirFor(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    // Invertir arreglo con for-each (usando copia)
    public static int[] invertirForEach(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        int index = arreglo.length;
        for (int elemento : arreglo) {
            invertido[--index] = elemento;
        }
        return invertido;
    }

    // Invertir arreglo con while
    public static int[] invertirWhile(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        int i = 0;
        while (i < arreglo.length) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
            i++;
        }
        return invertido;
    }

    // Invertir arreglo con do-while
    public static int[] invertirDoWhile(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        int i = 0;
        if (arreglo.length > 0) {
            do {
                invertido[i] = arreglo[arreglo.length - 1 - i];
                i++;
            } while (i < arreglo.length);
        }
        return invertido;
    }
}

