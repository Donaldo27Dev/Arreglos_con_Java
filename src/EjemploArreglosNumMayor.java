import java.util.Scanner;

public class EjemploArreglosNumMayor {
    // El objetivo de la clase es obtener el número mayor que se encuentra dentro de los elementos de un arreglo implementando el operador ternario
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese 5 valores enteros para cálcular el numero MAYOR");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = leer.nextInt();
        }

        int max = 0;
        // Se recorre el arreglo 'numeros' desde el índice 0 hasta el final
        for(int i = 0; i < numeros.length; i++){
            // Se compara el valor en la posición 'max' con el valor en la posición 'i'
            // Si el valor en 'numeros[max]' es mayor, se conserva el índice actual de 'max'
            // Si el valor en 'numeros[i]' es mayor, se actualiza 'max' al índice 'i'
            max = (numeros[max] > numeros[i])? max : i;
        }

        System.out.println("El valor MAYOR es: " + numeros[max]);
    }
}
