import java.util.Scanner;

public class EjemploArreglosParesImpares {
    // El objetivo de esta clase es dividir los elementos pares e impares que el usuario ingrese al programa
    // y separarlos en diferentes arreglos: "pares" y "impares" desde un arreglo principal: "a".
    public static void main(String[] args) {
        // Instanciar el objeto "leer" de la clase Scanner
        Scanner leer = new Scanner(System.in);
        int[] a, pares, impares;
        a = new int[10];

        // Declaración e inicialización de contadores
        int contadorPares = 0;
        int contadorImpar = 0;
        System.out.println("Ingrese 10 números enteros: ");
        // Llegar el arreglo "a" con los elementos que el usuario ingrese.
        for (int i = 0; i < a.length; i++){
            a[i] = leer.nextInt();
        }

        //Cálcular la cantidad de elementos pares e impares ingresados por el usuario.
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                //Es un número par
                contadorPares++;
            }else{
                //Es un numero impar
                contadorImpar++;
            }
        }

        // Inicializar los arreglos de acuerdo al valor obtenido por los contadores
        pares = new int[contadorPares];
        impares = new int[contadorImpar];

        // Variables para llevar el control de los indices que correspondien a los arreglos: "pares" y "impares"
        int j = 0;
        int k = 0;

        //Agregar elementos pares e impares en sus respectivos arreglos
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                pares[j++] = a[i];
            }else{
                impares[k++] = a[i];
            }
        }

        // Imprimir los elementos pares
        System.out.print("Elementos pares: ");
        for(int item: pares){
            System.out.print(item + " ");
        }

        // Imprimir los elementos impares
        System.out.print("\nElementos impares: ");
        for(int item: impares){
            System.out.print(item + " ");
        }
    }

}
