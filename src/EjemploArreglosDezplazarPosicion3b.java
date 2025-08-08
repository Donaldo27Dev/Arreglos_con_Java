import java.util.Scanner;

public class EjemploArreglosDezplazarPosicion3b {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] a = new int[7];
        int nuevoNumero, posicion, ultimo;

        // Agregar elementos al array
        for(int i = 0; i < a.length; i++){
            System.out.print("Ingresa un numero entero: ");
            a[i] = leer.nextInt();
        }
        System.out.println();

        System.out.println("Ingresa el numero que quieres agregar al arreglo");
        nuevoNumero = leer.nextInt();

        // Variable de control
        posicion = 0;
        // Encontrar la posicion
        while( posicion < (a.length - 1) && nuevoNumero > a[posicion]){
            posicion++;
        }

        // Respaldar el ultimo elemento del arreglo "a"
        ultimo = a[a.length - 1];

        // Dezplazar los elementos siguientes del array
        for(int i = a.length - 2; i >= posicion; i--){
            a[i + 1] = a[i];
        }

        // Nuevo arreglo b
        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);

        // Validar que el numero ingresado por el usuario sea mayor al ultimo elemento del arreglo
        if(nuevoNumero > ultimo){
            // El ultimo elemento sera el valor ingresado por el usuario de lo contario,
            // toma el valor del ultimo elemento del arreglo "a"
            b[b.length - 1] = nuevoNumero;
        } else {
            b[b.length - 1] = ultimo;
            // Asignar el nuevo valor ingresado
            b[posicion] = nuevoNumero;
        }

        // Mostrar la informacion
        for(int i = 0; i < b.length; i++){
            System.out.println(i + " => " + b[i]);
        }

    }
}
