import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {
    // El objetivo de la clase es ordenar alfabéticamente los elementos de un arreglo por medio del método de la burbuja

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
        //Arrays.sort(productos);
        //arregloInverso(productos);

        // También podemos implementar el API de colección que ofrece Java para invertir los elementos de un array.
        // Utilizamos el método "asList()" de la clase Arrays para transformar nuestro arreglo a un tipo de datos lista y este pueda ser pasado como parámetro al método ".reverse()"
        // Collections.reverse(Arrays.asList(productos));

        // Método de la Burbuja:
        // Se implementan dos "for", el primero para recorrer cada elemento de mi arreglo y el segundo para comparar cada par de elementos entre sí
        // y de esta manera ir ordenando el contenido. Para ordenar el contenido del arreglo se utiliza el método ".compareTo()" el cual pertenece a todos los objetos de java
        // que implementen la interfaz "Comparable". El método evalúa si un valor es mayor que otro con base en la posición de la tabla Unicode,
        // Sí el resultado de la comparación es mayor que 0, quiere decir que esta arriba del valor que esta pasando como argumento, y si por el contrario
        // el resultado de la comparación es menor que 0, quiere decir que esta por debajo de ese valor dentro del contexto de la tabla Unicode, por lo que su ordenamiento sera inferior.

        int contador = 0;
        for(int i = 0; i < count; i++){
           for(int k = 0; k < count; k++){
               // Si el resultado de la comparación es menor que 0, quiere decir que el valor comparado "productos[i]" con "productos[k]"
               // se encuentra en una posición más baja dentro de la tabla de valores Unicode, por lo tanto, tenemos que
               // hacer una reasignación de valores para ir ordenando.
               if(productos[i].compareTo(productos[k]) < 0){
                   // "aux" es una variable intermedia o auxiliar, el valor de "k" NO puede ser directamente "i",
                   // ya qué hemos asignado primero "productos[i] = productos[k]".
                   String aux = productos[i];

                   // Realizamos el cambio en el ordenamiento de los elementos
                   productos[i] = productos[k];
                   productos[k] = aux;
               }
               contador++;
           }
        }
        System.out.println("contador = " + contador);

        for(int i = 0; i < count; i++){
            System.out.println("Valor Num." + (i + 1) + ": " + productos[i]);
        }

    }
}
