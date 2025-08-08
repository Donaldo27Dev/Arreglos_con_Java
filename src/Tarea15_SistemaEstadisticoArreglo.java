import java.util.Scanner;

public class Tarea15_SistemaEstadisticoArreglo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[7];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa una cantidad entera: ");
            numeros[i] = leer.nextInt();
        }

        // Contador y acumulador para Nums. positivos
        double cantidadTotalPos = 0;
        double elemTotalesPos = 0;
        // Contador y acumulador para Nums. negativos
        double cantidadTotalNeg = 0;
        double elemTotalesNeg = 0;
        // Contador para Ceros
        int cantidadTotalCero = 0;

        // Procedimiento de sumas y conteos
        for (int i = 0; i < numeros.length; i++) {
            if ( numeros[i] > 0 ) {
                cantidadTotalPos += numeros[i];
                elemTotalesPos++;
            } else if ( numeros[i] < 0 ) {
                cantidadTotalNeg += numeros[i];
                elemTotalesNeg++;
            } else {
                cantidadTotalCero++;
            }

        }

        System.out.println("Promedio de numeros positivos " + (cantidadTotalPos / elemTotalesPos));
        System.out.println("Promedio de numeros negativos " + (cantidadTotalNeg / elemTotalesNeg));
        System.out.println("cantidad Total de Ceros = " + cantidadTotalCero);
    }
}