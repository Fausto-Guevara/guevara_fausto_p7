/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Junio-2024 
 */
public class Cifrado01 {
    private long cifrado;
    private final int semilla = 79;
    private final String diccionario = "abefimnoprsuv";

    /**
     * Constructor que encripta la clave dada.
     * @param clave Clave a cifrar.
     */
    public Cifrado01(String clave) {
        cifrado = recursion(semilla * 13 + diccionario.indexOf(clave.charAt(0)), clave.substring(1));
    }

    /**
     * Recursión sobre "clave" y encripta mediante potencias de 13.
     * @param acc Acumulador de la encriptación.
     * @param resto Resto de la clave a cifrar.
     * @return Valor cifrado.
     */
    private long recursion(long acc, String resto) {
        if (resto.length() == 1) return acc * 13 + diccionario.indexOf(resto.charAt(0));
        return recursion(13 * acc + diccionario.indexOf(resto.charAt(0)), resto.substring(1));
    }

    /**
     * @return long - cifrado. Devuelve la palabra "clave" cifrada.
     */
    public long obtenerCifrado() {
        return cifrado;
    }
}
