import java.util.Scanner;

public class EjemploArrgelosDetectarOrden {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[7];

        System.out.println("Ingresa 7 numero enteros");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = leer.nextInt();
        }
        // banderas
        boolean ascendente = false;
        boolean descendente = false;
        for(int i = 0; i < numeros.length - 1; i++){
            // Si arreglo esta ordenado de mayor a menor
            if(numeros[i] > numeros[i + 1]){
                descendente = true;
            }
            // Si arreglo esta ordenado de menor a mayor
            if(numeros[i] < numeros[i + 1]){
                ascendente = true;
            }

        }
        if(ascendente && descendente){
            System.out.println("Arreglo = desordenado");
        }

        if(!ascendente && !descendente){
            System.out.println("Arreglo = todos son iguales");
        }

        if(ascendente && !descendente){
            System.out.println("Arreglo = Ordenado de forma ascendente");
        }

        if(!ascendente && descendente){
            System.out.println("Arreglo = Ordenado de forma descendente");
        }
    }
}
