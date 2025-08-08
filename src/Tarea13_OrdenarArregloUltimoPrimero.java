import java.util.Scanner;

public class Tarea13_OrdenarArregloUltimoPrimero {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Declaración e inicialización de arreglos
        int[] a = new int[10];
        int[] b = new int[10];

        // Ingresar valores al arreglo
        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un numero entero: ");
            a[i] = leer.nextInt();
        }

        // Variables de control
        int indice = 0;
        int k = 1;
        for (int i = 0; i < (a.length / 2); i++) {
            b[indice++] = a[a.length - k++]; // Avanza de mayor a menor
            b[indice++] = a[i]; // Avanza de menor a mayor
        }

        // Mostrar resultado
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => " + b[i]);
        }
    }
}
