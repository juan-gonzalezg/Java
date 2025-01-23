
import java.util.Scanner;

public class ArreglosEjercicioTres {
   public static void main(String[] args) {
      double numeros[]=new double[15];
      int contador=0;
      Scanner teclado=new Scanner(System.in);
      for(int i=0; i<numeros.length; i++){
         System.out.println("Ingrese el numero para el índice "+i+": ");
         numeros[i]=teclado.nextDouble();
      }
      for(int i=0; i<numeros.length; i++){
         if(numeros[i]==3)
            contador++;
      }
      System.out.println("\nCantidad de veces que se cargó el número 3 es: "+contador);
   }
}
