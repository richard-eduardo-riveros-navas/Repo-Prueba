public class Proyecto3 {
    public static void main(String[] args) {
        int y=1;


        int[] arreglo = new int[50];

        for (int i = 0; i <= 49; i++) {
            arreglo[i] = i+1;
        }
        for (int i = 0; i <= 49; i++){
            System.out.println("El numero de la "+y+"ª posicion del vector/arreglo es: "+arreglo[i]);
            y=y+1;
        }}}
