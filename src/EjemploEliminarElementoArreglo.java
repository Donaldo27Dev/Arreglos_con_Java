import java.util.Scanner;

public class EjemploEliminarElementoArreglo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] a = new int[10];

        // Agregar elementos al array
        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = leer.nextInt();
        }

        System.out.println();
        // Solicitar elemento a eliminar
        System.out.println("Ingrese una posicion a eliminar entre 0 y 9: ");
        int posicion = leer.nextInt();

        // Logica para dezplazar los elementos hacia abajo
        for (int i = posicion; i < (a.length - 1); i++) {
            a[i] = a[i + 1];
        }

        int[] b = new int[a.length - 1];
        // Metodo de la System para copiar un arreglo
        System.arraycopy(a,0, b, 0,b.length);

        // Podemos mantener el arreglo a
        a = b;

        // Iterar el nuevo arreglo b
        for(int i = 0; i < a.length; i++){
            System.out.println( i + " => " + a[i]);
        }

    }
}


