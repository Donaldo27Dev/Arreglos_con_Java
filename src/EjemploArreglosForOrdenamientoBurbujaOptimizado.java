public class EjemploArreglosForOrdenamientoBurbujaOptimizado {
    // El objetivo de la clase es ordenar alfabéticamente los elementos de un arreglo por medio del método de la burbuja

    // Método de la Burbuja:
    // Se implementan dos "for", el primero para recorrer cada elemento de mi arreglo y el segundo para comparar cada par de elementos entre sí
    // y de esta manera ir ordenando el contenido. Para ordenar el contenido del arreglo se utiliza el método ".compareTo()" el cual pertenece a todos los objetos de java
    // que implementen la interfaz "Comparable". El método evalúa si un valor es mayor que otro con base en la posición de la tabla Unicode,
    // Sí el resultado de la comparación es mayor que 0, quiere decir que esta arriba del valor que esta pasando como argumento, y si por el contrario
    // el resultado de la comparación es menor que 0, quiere decir que esta por debajo de ese valor dentro del contexto de la tabla Unicode, por lo que su ordenamiento sera inferior.
    public static void algoritmoBurbuja(Object[] arreglo){
        int contador = 0;
        int totalElementosArray = arreglo.length;

        for(int i = 0; i < totalElementosArray; i++){
            for(int j = 0; j < totalElementosArray - 1 - i; j++){
                if( ((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0 ){
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
                contador++;
            }
        }
        System.out.println("contador2 = " + contador);


    // ============================= MÉTODO DE LA BURBUJA CON NÚMEROS =============================
    //        int contador2 = 0;
    //        for(int i = 0; i < numeros.length; i++){
    //            for(int j = 0; j < numeros.length - 1 - i; j++){
    //                // Se realiza un cast al arreglo "numeros" para poder hacer uso del metodo ".compareTo()"
    //                if( ((Integer)numeros[j + 1]).compareTo(numeros[j]) < 0 ){
    //                    int aux = numeros[j];
    //                    numeros[j] = numeros[j + 1];
    //                    numeros[j + 1] = aux;
    //                }
    //                contador2++;
    //            }
    //        }
    //        System.out.println("contador2 = " + contador2);

    }

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
                "Asus Notebook", "Macbook Air", "Cromecast 4ta Generación", "Mouse Logitech A21"};

        int countStr = productos.length;
        algoritmoBurbuja(productos);

        System.out.println(" Resultados de array String ");
        for(int i = 0; i < countStr; i++){
            System.out.println("Valor Num." + (i + 1) + ": " + productos[i]);
        }

        // Cambiamos de tipo de dato primitivo a tipo de dato de referencia "Integer", para que este pueda pasar como
        // un Object al método estático "algoritmoBurbuja()"
        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        int countInt = numeros.length;
        algoritmoBurbuja(numeros);

        System.out.println(" Resultados de array Entero(int) ");
        for(int i = 0; i < countInt; i++){
            System.out.println("numero " + (i + 1) + ": " + numeros[i]);
        }

    }
}
