public class EjemploArreglosOrdenPrincipioFinal {
    // El objetivo de esta clase es imprimir el i-ésimo número por el principio y el i-ésimo número por el final.
    public static void main(String[] args){
    int[] numeros = new int[10];
    int[] numeros2 = new int[10];

    // Bucle for para controlar la cantidad de ciclos de mi objeto "numeros". NOTA: Para no repetir la secuencia por ambos extremos hasta el número 10 se puede
    // dividir el total de elementos del arreglo entre dos o ir restando la variable i.
    int conteo = 0;
    for(int i = 0; i < numeros.length / 2; i++) {
        // Agregar el primer valor i-ésimo al arreglo
        numeros2[conteo++] = i + 1;
        // Agregar el último valor i-ésimo al arreglo
        numeros2[conteo++] = numeros.length - i;

        // ================= PROCESO DE PRUEBA PARA: imprimir el i-ésimo número por el principio y el i-ésimo número por el final
        // únicamente sumo uno a la variable i para iniciar el ciclo en 1 y continue hasta 10
        //System.out.print((i + 1));
        // le resto la variable i al total de elementos que tiene mi arreglo y el conteo se realice de manera decreciente
        //System.out.println(" " + (numeros.length - i));
    }

    for(int i = 0; i < numeros2.length; i++){
        System.out.println("Posición " + i + " valor: " + numeros2[i]);
    }

    }
}
