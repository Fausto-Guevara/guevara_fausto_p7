/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Junio-2024 
 */
public class Descifrado {
    private final String diccionario = "abefimnoprsuv";

    /**
     * Desencripta el valor numérico dado a una clave de 11 caracteres.
     * @param cifrado el valor numérico a desencriptar.
     * @return la clave desencriptada.
     */
    public String descifrar(long cifrado) {
        return decrypt(cifrado, 11); // Cambiamos de 10 a 11
    }

    /**
     * Función recursiva para desencriptar el valor numérico.
     * @param cifrado el valor numérico a desencriptar.
     * @param length la longitud restante de la clave a reconstruir.
     * @return la clave reconstruida hasta ahora.
     */
    private String decrypt(long cifrado, int length) {
        if (length == 0) {
            return "";
        }
        int dicLength = diccionario.length();
        long resto = cifrado % dicLength;
        char character = diccionario.charAt((int) resto);
        cifrado = (cifrado - resto) / 13;
        return decrypt(cifrado, length - 1) + character;
    }
}
