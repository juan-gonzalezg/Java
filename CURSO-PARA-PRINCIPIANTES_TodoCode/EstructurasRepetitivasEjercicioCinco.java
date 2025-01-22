
import java.util.Scanner;

public class EstructurasRepetitivasEjercicioCinco {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      String palabra;
      boolean respuesta = false;
      System.out.print("Ingrese la palabra que quiera mostrar por telado: ");
      palabra = teclado.nextLine();
      while(respuesta == false) {
         System.out.println("Palabra ingresada: " + palabra);
         System.out.print("Ingrese la palabra que quiera mostrar por telado: ");
         palabra = teclado.nextLine();
         if (palabra.equalsIgnoreCase("salir"))
            respuesta = true;
         else
            System.out.println("---------------------------------------------");
      }
   }
}
