package tema2_debug;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAlumnos,contador;
        double suma,nota;
        contador = 1;
        suma = 0;
      do {
        System.out.print("Introduce el número de alumnos: ");
        numAlumnos = sc.nextInt();
      }while(numAlumnos<=0);
   
        while (contador <= numAlumnos) {
            System.out.print("Introduce la nota del alumno " + contador + ": ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: la nota debe estar entre 0 y 10");
            }
            else {
            suma = suma + nota;
            contador++;
            }
        }

        double media = suma / numAlumnos;
        System.out.println("La media del grupo es: " + media);

        sc.close();
    }
}
