import java.util.Scanner;

public class CondicionalIf {
   public static void main(String args[]) {
      int edad;
      System.out.print("Ingrese su edad: ");
      Scanner teclado = new Scanner(System.in);
      edad = teclado.nextInt();
      if (edad >= 18)
         System.out.println("Usted es mayor de edad");
      else
         System.out.println("Usted es menor de edad");
   }
}