public class Proyecto3 {
    public static void main(String[] args) {

        // 1. Creamos los arreglos con el tamaño exacto (50 pares y 50 impares)
        int[] pares = new int[50];
        int[] impares = new int[50];

        // 2. Necesitamos contadores independientes para saber en qué posición
        // de cada arreglo vamos a guardar el siguiente número
        int indicePares = 0;
        int indiceImpares = 0;

        // 3. Un solo ciclo para recorrer los números del 1 al 100 y ALMACENARLOS
        for (int numero = 1; numero <= 100; numero++) {

            if (numero % 2 == 0) {
                // Si es par, lo guardamos en el arreglo de pares
                pares[indicePares] = numero;
                indicePares++; // Avanzamos a la siguiente casilla vacía
            } else {
                // Si es impar, lo guardamos en el arreglo de impares
                impares[indiceImpares] = numero;
                indiceImpares++; // Avanzamos a la siguiente casilla vacía
            }
        }

        // 4. IMPRIMIR los números almacenados

        System.out.println("--- NÚMEROS PARES ---");
        // Usamos pares.length para recorrer exactamente el tamaño del arreglo
        for (int i = 0; i < pares.length; i++) {
            System.out.println("El numero par de la " + (i + 1) + "ª posicion es: " + pares[i]);
        }

        System.out.println("\n--- NÚMEROS IMPARES ---");
        for (int i = 0; i < impares.length; i++) {
            System.out.println("El numero impar de la " + (i + 1) + "ª posicion es: " + impares[i]);
        }
    }
}