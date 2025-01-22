
import java.util.Scanner;

public class OperadorTernario {
   public static void main(String[] args) {
      double promedio;
      String condicionFinal;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Introduce el promedio del alumno: ");
      promedio = teclado.nextDouble();
      condicionFinal = (promedio >=6) ? "Aprobado" : "Reprobado";
      System.out.println("El alumno esta: " + condicionFinal + " con un promedio de: " + promedio);
   }
}
