
import java.util.Scanner;

public class CondicionalEjercicioUno {
   public static void main(String[] args) {
      int edad;
      Scanner teclado = new Scanner(System.in);
      System.out.println("Bienvenido a English School");
      System.out.print("Introduce la edad del alumno: ");
      edad = teclado.nextInt();
      if (edad >= 4 && edad <= 6)
         System.out.println("El horario del grupo Kinder, es Lunes y Miercoles de 16 a 17 hs");
      else {
         if (edad >= 7 && edad <= 8) 
            System.out.println("El horario del grupo 1st year, es Martes y Jueves de 16:30 a 17:30 hs");
         else {
            if (edad >= 9 && edad <= 10)
               System.out.println("El horario del grupo 2nd year, es Martes y Jueves de 17:30 a 19 hs");
            else {
               if (edad >= 11 && edad <= 13)
                  System.out.println("El horario del grupo 3rd year, es Lunes y Miercoles de 17 a 18:30 hs");
               else
                  System.out.println("No hay grupo para la edad ingresada");
            }
         }
      }
   }
}
