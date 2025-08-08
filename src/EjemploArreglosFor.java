import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args){
        // El objetivo de esta clase es implementar diferentes Loops para recorrer los elementos que contiene un arreglo
        // identificando variables en el contexto del Loop, la implementación de la lógica y su funcionalidad.
        // Arreglo de cadenas
        String[] productos = new String[7];
        // Definir una variable que almacene la cantidad de elementos que contiene mi arreglo es mucho más eficiente
        // que hacerlo dentro la condicional del Loop.
        int count = productos.length;
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy S24";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Cromecast 4ta Generación";
        productos[6] = "Mouse Logitech A21";

        // Puedo utilizar el método ".sort()" de la clase "Arrays" para Ordenar Alfabéticamente el contenido de mi arreglo productos.
        Arrays.sort(productos);

        System.out.println("======== USANDO FOR ========");
        for(int i = 0; i < count; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("======== USANDO FOREACH ========");
        for(String prod: productos){
            System.out.println("item = " + prod);
        }

        System.out.println("======== USANDO WHILE ========");
        int i = 0;
        while(i < count){
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("======== USANDO DO WHILE ========");
        int j = 0;
        do{
            System.out.println("para indice " + j + " : " + productos[j]);
            j++;
        }while(j < count);

        // Arreglo de Enteros
        int[] numeros = new int[11];
        // Definir una variable que almacene la cantidad de elementos que contiene mi arreglo es mucho más eficiente
        // que hacerlo dentro la condicional del Loop.
        int counNum = numeros.length;

        for(int k = 1; k < counNum; k++){
            numeros[k] = k * 3;
        }

        for(int k = 1; k < counNum; k++){
            System.out.println("numeros = " + numeros[k]);
        }

    }
}
