
import java.util.Scanner;

public class EstructurasRepetitivasEjercicioDos {
   public static void main(String[] args) {
      int contador=1, limite;
      Scanner teclado=new Scanner(System.in);
      System.out.print("Indica un limite numerico: ");
      limite=teclado.nextInt();
      while(contador<=limite){
         System.out.print(contador);
         if (contador!=limite)
            System.out.print(", ");
         else
            System.out.println(".");
         contador++;
      }
   }
}
