public class EjemploArreglosCombinadosMultiplesElementos {
    // El objetivo de la clase es combinar dos arreglos en un tercero con multiples elementos.
    public static void main(String[] args) {
        int[] a,b,c;
        a = new int[9];
        b = new int[9];
        c = new int[18];

        for(int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }

        for(int i = 0; i < b.length; i++){
            b[i] = (i + 1) * 5;
        }

        int auxConteo = 0;
        for(int i = 0; i < c.length / 2 ; i+=3){
            for(int j = 0; j < 3; j++){
                c[auxConteo++] = a[i + j];
            }
            for(int j = 0; j < 3; j++){
                c[auxConteo++] = b[i + j];
            }
        }

        for(int i = 0; i < c.length; i++){
            System.out.println(i + " : " + c[i]);
        }
    }
}
