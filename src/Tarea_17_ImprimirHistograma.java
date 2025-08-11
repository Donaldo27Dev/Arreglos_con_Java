import java.util.Scanner;

public class Tarea_17_ImprimirHistograma {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[12];

        // Obtener los datos ingresados por el usuario, 12 valores
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese un número entre 1 y 6: ");
            int valorUs = leer.nextInt();
            // Validar datos ingresados por el usuario
            if (valorUs <= 0 || valorUs > 6) {
                System.err.print("Valor ingresado fuera del limite: 1 - 6");
                System.exit(-1);
            } else {
                numeros[i] = valorUs;
            }

        }

        // Crear un nuevo arreglo del tipo String para trabajar de forma paralela con los datos ingresados por el usuario.
        String[] histogramaNumeros = new String[6];

        // Recorrer los elementos de rango establecido en el ejercicio: de 1 al 6.
        for (int i = 0; i < histogramaNumeros.length; i++) {

            // Iniciar el conteo desde 1
            int valActual = i + 1;
            // Preparar el mensaje
            String mensaje = valActual + ": ";

            // Recorrer los elementos del arreglo "numeros"
            for (int j = 0; j < numeros.length; j++) {
                // Agregar asteriscos de acuerdo a la cantidad de veces encontrado el elemento actual de j en el arreglo "numeros"
                if(valActual == numeros[j]) {
                    mensaje += "*";
                }
            }
            // Agregar al arreglo "histogramaNumeros" en la posición actual de i, el nuevo string generado
            histogramaNumeros[i] = mensaje;
        }

        // Mostrar el resultado
        for(int i = 0; i < histogramaNumeros.length; i++){
            System.out.println(histogramaNumeros[i]);
        }
    }
}
