
import java.util.Scanner;

public class Operadores {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      double num1, num2, division;
      System.out.print("Ingrese el primer número: ");
      num1 = teclado.nextDouble();
      System.out.print("Ingrese el segundo número: ");
      num2 = teclado.nextDouble();
      division = num1 / num2;
      System.out.println("La suma de los numeros: " + division);
   }
}
