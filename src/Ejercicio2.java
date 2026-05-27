 import java.util.Scanner;


    public class Ejercicio {
        public static void main(String[] args) {
            int y=1;
            Scanner entrada = new Scanner(System.in);

            int[] arreglo = new int[10];

            for (int i = 0; i <= 9; i++) {
                System.out.println("Ingrese el numero de la " + y + "ª posicion del vector/arreglo: ");
                arreglo[i] = entrada.nextInt();
                y=y+1;
            }
            for (int i = 0; i <= 9; i++){
                System.out.println("El numero de la "+y+"ª posicion del vector/arreglo es: "+arreglo[i]);
                y=y+1;
            }}}

