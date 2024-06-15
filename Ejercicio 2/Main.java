/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Junio-2024 
 */
public class Main {
    public static void main(String[] args) {
        // Ejemplo de clave a cifrar
        String claveOriginal = "abefimnoprs"; // 11 caracteres

        // Crear objeto de cifrado
        Cifrado01 cifrado = new Cifrado01(claveOriginal);
        long valorCifrado = cifrado.obtenerCifrado();
        System.out.println("Valor cifrado: " + valorCifrado);

        // Crear objeto de descifrado
        Descifrado descifrado = new Descifrado();
        String claveDescifrada = descifrado.descifrar(valorCifrado);
        System.out.println("Clave descifrada: " + claveDescifrada);

        // Verificar si la clave original es igual a la clave descifrada
        if (claveOriginal.equals(claveDescifrada)) {
            System.out.println("La clave ha sido descifrada correctamente.");
        } else {
            System.out.println("Error al descifrar la clave.");
        }
    }
}

