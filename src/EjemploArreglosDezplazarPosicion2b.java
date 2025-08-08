import java.util.Scanner;

public class EjemploArreglosDezplazarPosicion2b {
    // El objetivo de la clase es desplazar los elementos de un arreglo apartir de una posicion ingresada por el usuario,
    // lo que ademas le permite agregar un nuevo valor en esa posicion
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int indiceUs, valorUs, ultimo;
        int[] a = new int[10];

        // Agregar elementos al array
        for(int i = 0; i < a.length; i++){
            System.out.print("Ingresa un numero entero: ");
            a[i] = leer.nextInt();
        }

        // Solicitar Datos
        System.out.println("Ingresa que posicion del arreglo quieres recorrer (0 - 9)");
        indiceUs = leer.nextInt();
        System.out.println("Ingresa el nuevo valor a agregar al array");
        valorUs = leer.nextInt();

        // Respaldar el último elemento
        ultimo = a[a.length - 1];

        // Dezplazar el arreglo de atras hacia delante, hasta que i sea mayor o igual al indice ingresado por el usuario
        for(int i = a.length - 2; i >= indiceUs; i--){
            a[i+1] = a[i];
        }

        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);

        // Reasignar el arreglo "b" al arreglo "a"
        a = b;

        // Asignar el nuevo valor al arreglo
        a[indiceUs] = valorUs;
        // Tambien agregamos el ultimo elemento guardado al arreglo
        a[b.length - 1] = ultimo;

        // Mostrar los datos
        for(int i = 0; i < a.length; i++){
            System.out.println( i + " = " + a[i]);
        }
    }
}
