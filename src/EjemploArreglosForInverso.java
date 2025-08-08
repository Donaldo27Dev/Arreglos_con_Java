import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args){
        // El objetivo de la clase es recorrer los valores de un arreglo de forma inversa, y esto se puede lograr de dos maneras.
        String[] productos = new String[7];
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

        // 1.-
        System.out.println("======== USANDO FOR INVERSO ========");
        // Implementamos la estructura normal de un ciclo "for" para recorrer los elementos de un arreglo.
        // Obtenemos el último índice con la instrucción (productos[count - 1]) y
        // restamos el valor de "i" en cada iteración del ciclo for para ir de atrás hacia delante.
        for(int i = 0; i < count; i++){
            System.out.println("para i = " + (count - 1 - i ) + " valor: " + (productos[count - 1 - i]));
        }
        // 2.-
        System.out.println("======== USANDO FOR INVERSO 2 ========");
        // Utilizar como valor iniciar la cantidad total del índice que tiene el arreglo (int i = count - 1), para posteriormente ir decrementando
        // el valor de "i" y asi poder ir recorriendo cada uno de los valores de mi arreglo de atrás hacia delante.
        for(int i = count - 1; i >= 0; i--){
            System.out.println("para i = " + i + " valor: " + (productos[i]));
        }

    }
}
