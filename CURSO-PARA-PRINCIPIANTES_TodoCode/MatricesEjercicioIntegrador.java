
import java.util.Scanner;

public class MatricesEjercicioIntegrador {
   public static void main(String[] args) {
      double notas[][]=new double[4][3];
      double promedio[]=new double[4];
      double notaTotal;
      Scanner teclado=new Scanner(System.in);
      for(int i=0; i<notas.length; i++){
         System.out.println("Ingrese las 3 notas del Alumno "+(i+1)+": ");
         for(int j=0; j<notas[0].length; j++){
            System.out.print("Nota "+(j+1)+": ");
            notas[i][j]=teclado.nextDouble();
         }
         System.out.println("");
      }
      for(int i=0; i<notas.length; i++){
         notaTotal=0;
         for(int j=0; j<notas[0].length; j++){
            notaTotal+=notas[i][j];
         }
         promedio[i]=notaTotal/notas[0].length;
      }
      System.out.println("----------Notas y Promeidos de Alumnos----------");

      for(int i=0; i<notas.length; i++){
         System.out.print("\nNotas del Alumno Nro. "+(i+1)+" son: ");
         for(int j=0; j<notas[0].length; j++){
            System.out.print(notas[i][j]);
            if(j<notas[0].length-1)
               System.out.print(", ");
            else
               System.out.println(". ");
         }
         System.out.println("Promedio: "+promedio[i]+".");
         System.out.println("------------------------------------------------");
      }
   }
}
