import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args){
        // Podemos crear un arreglo por medio de una instancia de un objeto del tipo arreglo(int[]) que a su ves tenemos
        // que indicar la longitud de elementos que este va a poder tener, en este ejemplo 4.
        int[] numeros = new int[4];
        // También podemos crear un arreglo y asignar directamente valores en él, ejemplo:
        // int[] numeros = {1,2,3,4};

        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy S24";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Cromecast 4ta Generación";
        productos[6] = "Mouse Logitech A21";


        // Puedo utilizar el método ".sort()" de la clase "Arrays" para Ordenar Alfabéticamente el contenido de mi
        // arreglo productos. La clase "Arrays" contiene un conjunto de métodos y procesos de ayuda para trabajar con arrays
        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];


        // Los arreglos del tipo de dato "String" por defecto tienen el valor de null, este valor es asignado a cada
        // uno de los elementos que lo componen.
        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + prod3);
        System.out.println("productos[3] = " + prod4);
        System.out.println("productos[4] = " + prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("productos[6] = " + prod7);

        // Los valores asignados deben ser del mismo tipo de dato del arreglo, no puede ser diferente
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        // Método ".sort()" de la clase "Arrays" para ordenar los números de mi objeto "números"
        Arrays.sort(numeros);

        // Caso similar a los arreglos del tipo String, los arreglos del tipo de dato "int" por defecto tienen el valor de 0,
        // este valor es asignado a cada uno de los elementos que lo componen.
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];


        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
