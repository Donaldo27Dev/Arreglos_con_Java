import java.util.Scanner;

public class Tarea16_MayorOcurrenciaArreglo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numerosUs = new int[10];
        int[] aux = new int[10];

        // Solicitar datos
        for (int i = 0; i < numerosUs.length; i++) {
            System.out.print("Ingrese un numero entre el rango de 1 a 9: ");
            numerosUs[i] = leer.nextInt();
        }

        // Lógica para recorrer y comparar cada elemento
        for (int i = 0; i < numerosUs.length; i++) {
            int elementoRepetido = 0;
            for (int k = 0; k < numerosUs.length; k++) {
                // Comparar cada uno de los elementos del arreglo "numerosUs"
                if (numerosUs[i] == numerosUs[k]) {
                    elementoRepetido++;
                }
            }
            aux[i] = elementoRepetido;
        }

        for (int i = 0; i < aux.length; i++) {
            System.out.println(" aux = " + aux[i]);
        }

        // Indice del elemento con la mayor ocurrencia
        int indice = 0;
        // Ocurrencia
        int max = 0;
        for (int i = 0; i < aux.length; i++) {
            if (max < aux[i]) {
                max = aux[i];
                indice = i;
            }
        }

        // Mostrar información
        System.out.println("El elemento que se repite más veces es:  " + numerosUs[indice]);
        System.out.println("Tiene una ocurrencia de: " + max);


    }
}




