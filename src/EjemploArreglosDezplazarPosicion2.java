import java.util.Scanner;

public class EjemploArreglosDezplazarPosicion2 {
    // El objetivo de la clase es desplazar los elementos de un arreglo apartir de una posicion ingresada por el usuario,
    // lo que ademas le permite agregar un nuevo valor en esa posicion
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] a = new int[10];

        // Agregar elementos al array: a[], de 0 a 8 valores, el 9 por defaul de le asigna 0
        for(int i = 0; i < a.length - 1; i++){
            System.out.print("Ingresa un numero entero: ");
            a[i] = leer.nextInt();
        }

        // Solicitar Datos
        System.out.println("Ingresa que posicion del arreglo quieres recorrer (0 - 9)");
        int indiceUs = leer.nextInt();
        System.out.println("Ingresa el nuevo valor a agregar al array");
        int valorUs = leer.nextInt();

        // Dezplazar el arreglo de atras hacia delante, hasta que i sea mayor o igual al indice ingresado por el usuario
        for(int i = a.length - 2; i >= indiceUs; i--){
            a[i+1] = a[i];
        }

        // Asignar el nuevo valor al array
        a[indiceUs] = valorUs;

        // Mostrar los datos
        for(int i = 0; i < a.length; i++){
            System.out.println( i + " = " + a[i]);
        }
    }
}
