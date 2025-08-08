import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    // El objetivo de la clase es recorrer los valores de un arreglo de forma inversa y modificar sus valores
    // Lo hacemos por medio de una reasignación de valores, el primero toma el valor del último elemento y viceversa.

    // Función para invertir y cambiar los valores de un arreglo de forma explícita
    public static void arregloInverso(String[] arreglo){
        // Me permite controlar la cantidad de iteraciones en decremento y reduce el número de vueltas para evitar rehacer los cambios ya realizados.
        int contador1 = arreglo.length;
        // Me permite controlar la indice de mi arreglo
        int contador2 = arreglo.length;

        // Función: Invierte el contenido del arreglo intercambiando elementos desde los extremos hacia el centro.
        for(int i = 0; i < contador1 ; i++){
            // Obtenemos el valor del primer elemento
            String elemAct = arreglo[i];
            // Obtenemos el valor del inverso del primer elemento
            String elemInverso = arreglo[contador2 - 1 - i];
            // Se hace una reasignación de valores:
            // El valor del primer elemento será igual al valor del último
            arreglo[i] = elemInverso;
            // El valor del último elemento será igual al valor del primero
            arreglo[contador2 - 1 - i] = elemAct;
            contador1--;
        }
    }
    public static void main(String[] args){

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy S24", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Cromecast 4ta Generación", "Mouse Logitech A21", "Bocina Asus"};
        int count = productos.length;

        // Puedo utilizar el método ".sort()" de la clase "Arrays" para Ordenar Alfabéticamente el contenido de mi arreglo productos.
        Arrays.sort(productos);
        //arregloInverso(productos);

        // También podemos implementar el API de colección que ofrece Java para invertir los elementos de un array.
        // Utilizamos el método "asList()" de la clase Arrays para transformar nuestro arreglo a un tipo de datos lista y este pueda ser pasado como parámetro al método ".reverse()"
        Collections.reverse(Arrays.asList(productos));

        System.out.println("======== USANDO FOR ========");
        for(int i = 0; i < count; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

    }
}
