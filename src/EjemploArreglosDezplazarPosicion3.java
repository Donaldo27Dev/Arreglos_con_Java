import java.util.Scanner;

public class EjemploArreglosDezplazarPosicion3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] a = new int[7];
        int nuevoNumero, posicion;

        // Agregar elementos al array
        for(int i = 0; i < a.length - 1; i++){
            System.out.print("Ingresa un numero entero: ");
            a[i] = leer.nextInt();
        }
        System.out.println();

        System.out.println("Ingresa el numero que quieres agregar al arreglo");
        nuevoNumero = leer.nextInt();

        posicion = 0;

        // Encontrar la posicion
        while( posicion < (a.length - 1) && nuevoNumero > a[posicion]){
            posicion++;
        }

        // Dezplazar los elementos siguientes del array
        for(int i = a.length - 2; i >= posicion; i--){
            a[i + 1] = a[i];
        }
        // Asignar el nuevo valor ingresado
        a[posicion] = nuevoNumero;

        // Mostrar la informacion
        for(int i = 0; i < a.length; i++){
            System.out.println(i + " => " + a[i]);
        }

    }
}
