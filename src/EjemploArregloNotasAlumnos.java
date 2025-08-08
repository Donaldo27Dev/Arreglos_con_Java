import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    // El objetivo de la clase es crear un programa que cálcule el primedio por materia y del curso. El curso se compone
    // de tres materias, cada una con 7 alumnos asignados y el usuario pueda consultar el promedio de alguno de esos los alumnos.
    public static void main(String[] args){
        Scanner entradaUs = new Scanner(System.in);
        // Declaracion e inicializacion de los arreglos para almacenar las calificaciones de las materias escolares
        double[] claseMatematicas, claseHistoria, claseLenguas;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguas = new double[7];

        // Contadores para sumar la calificacion total por asignatura
        double sumClaseMat = 0, sumClaseHis = 0, sumClaseLen = 0;

        // Obtener las calificaciones de la materia de MATEMATICAS en el arreglo "claseMatematicas"
        System.out.println("Ingrese las 7 notas de los alumnos de la clase de MATEMATICAS 📐");
        for(int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = entradaUs.nextDouble();
        }

        // Obtener las calificaciones de la materia de HISTORIA en el arreglo "claseHistoria"
        System.out.println("Ingrese las 7 notas de los alumnos de la clase de HISTORIA 📕");
        for(int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = entradaUs.nextDouble();
        }

        // Obtener las calificaciones de la materia de LENGUAS en el arreglo "claseLenguas"
        System.out.println("Ingrese las 7 notas de los alumnos de la clase de LENGUAS 🗣");
        for(int i = 0; i < claseLenguas.length; i++){
            claseLenguas[i] = entradaUs.nextDouble();
        }

        // Realizamos el conteo para obtener la suma total por materia y poder promediar las notas
        for(int i = 0; i < 7; i++){
            sumClaseMat += claseMatematicas[i];
            sumClaseHis += claseHistoria[i];
            sumClaseLen += claseLenguas[i];
        }

        // Obtenemos los promedio por clase
        double promedioClaseMat = sumClaseMat/claseMatematicas.length;
        double promedioClaseHis = sumClaseHis/claseHistoria.length;
        double promedioClaseLen = sumClaseLen/claseLenguas.length;

        // Mostrar los promedios por clase y curso al usuario
        System.out.println("El promedio de la clase de matemáticas es: " + promedioClaseMat);
        System.out.println("El promedio de la clase de historia es: " + promedioClaseHis);
        System.out.println("El promedio de la clase de lenguas es: " + promedioClaseLen);
        System.out.println("El promedio total del curso es: " + ((promedioClaseMat+promedioClaseHis+promedioClaseLen)/3));


        int idAlum = 0;
        // Buscamos las notas por materia de acuerdo a la posicion que ingresa el usuario, que en este caso manejamos
        // lo manejamos como id del usuario
        System.out.println("Ingrese el id(0 - 6) del alumno que quiere promediar: ");
        try {
            idAlum = entradaUs.nextInt();
            double notaMat = claseMatematicas[idAlum];
            double notaHis = claseHistoria[idAlum];
            double notaLen = claseLenguas[idAlum];
            // Promediamos las notas del alumno
            double promAlum = (notaMat + notaHis + notaLen) / 3;
            System.out.println("El promedio del alumno con id " + idAlum + " es: " + promAlum);
        }catch (IndexOutOfBoundsException error){
            System.err.print("Ingrese un id válido (0 - 6)");
            System.exit(-1);
        }

    }
}
