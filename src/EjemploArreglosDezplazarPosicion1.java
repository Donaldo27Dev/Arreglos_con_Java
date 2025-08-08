import java.util.Scanner;

public class EjemploArreglosDezplazarPosicion1 {
    // El objetivo de la clase es recorrer los valores de un arreglo un indice hacia dentante y el ultimo elemento colocarlo al inicio, en el indice 0.
    // ejemplo: 0 = 10, 1 = 1, 2 = 2, 3 = 3 ...
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Declaracion e inicializacion dos arreglos, uno para almacenar los valores ingresados por el usuario y
        // otro para desarrollar la logica de ordenamiento
        int[] numerosUs, numerosOrdenados;
        numerosUs = new int[10];
        numerosOrdenados = new int[10];

        // Agregar elementos al array: numeros[]
        System.out.println("Ingresa diez numeros: ");
        for(int i = 0; i < numerosUs.length; i++){
            numerosUs[i] = leer.nextInt();
        }

        // Recorrer los dos arreglos desde el indice 1, dejando de lado el indice [0] del array numerosOrdenados[]
        for(int i = 1; i < numerosUs.length + 1; i++){
            numerosOrdenados[i] = numerosUs[i - 1];
            // Evaluar que la variable i sea igual a la ultima posicion del arreglo
            if( i == (numerosUs.length - 1) ){
                numerosOrdenados[0] = numerosUs[numerosUs.length - 1]; // Almacenar en la primera posicion de mi arreglo numerosOrdenados[] el valor del ultimo elemento del array principal
                break; // interrumpir el loop for
            }
        }


        System.out.println("Solucion 1: ");
        // Mostrar los datos
        for(int i = 0; i < numerosOrdenados.length; i++){
            System.out.println( i + " = " + numerosOrdenados[i]);
        }


        // Otra manera de resolver el ejercicio:
        System.out.println("Solucion 2: ");
        // Guardar el ultimo valor del arreglo
        int ultimoElemento = numerosUs[numerosUs.length - 1];
        for(int i = numerosUs.length - 2; i <= 0; i--){
            numerosUs[i + 1] = numerosUs[i];
        }
        numerosUs[0] = ultimoElemento;

        // Mostrar los datos
        for(int i = 0; i < numerosUs.length; i++){
            System.out.println( i + " = " + numerosOrdenados[i]);
        }
    }
}
