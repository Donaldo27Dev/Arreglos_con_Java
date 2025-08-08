import java.util.Scanner;

public class Tarea14_ImprimirNumeroMasAlto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] a = new int[7];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número entre 11 y 99: ");
            a[i] = leer.nextInt();
        }

        // Utilizando operador ternario
        int valorMax = 0;
        for ( int i = 0; i < a.length; i++ ) {
            valorMax = (a[valorMax] > a[i])?  valorMax : i;
        }
        System.out.println("FORMA 1 ====================================");
        System.out.println("El valor máximo encontrado en el arreglo es: " + a[valorMax]);

        // Validando la cantidad entre iteraciones
        int numeroInicial = a[0];
        int valorMaximo = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > numeroInicial) {
                valorMaximo = a[i];
            }
        }
        System.out.println("FORMA 2 ====================================");
        System.out.println("El valor máximo encontrado en el arreglo es: " + valorMaximo);

    }
}