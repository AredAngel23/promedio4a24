import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PromedioGrupo {
    public static void main(String[] args) throws Exception {
        int n; //tamaño del grupo
        double[] calificaciones; //calificaciones de cada alumno
        double suma = 0; //para sumar calificaciones
        double promedio; //el promedio del grupo

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("--------------------------------------------");
        //Recuperando el tamaño del grupo
        System.out.println("Escribe el número de alumnos en el grupo: ");
        entrada = bufer.readLine(); //Lectura del teclado
        n = Integer.parseInt(entrada); //Conversión de String a int

        calificaciones = new double[n];//Construcción del arreglo

        //Pedir cada calificación y acumularla
        for (int i = 0; i < calificaciones.length; i++){
            System.out.println("Escribe la calificación del estudiante [" + (i+1) + "]:");
            entrada = bufer.readLine();
            calificaciones[i]= Double.parseDouble(entrada);
            suma += calificaciones[i];
        }
        //Obtener el promedio
        promedio = suma / n;

        System.out.println("--------------------------------------------");
        System.out.println("Las calificaciones de cada alumno son: ");
        for (double calif : calificaciones){
            System.out.println(calif);
        }
        System.out.println("--------------------------------------------");
        System.out.println("El promedio de grupo es: " + promedio);
    }
}
