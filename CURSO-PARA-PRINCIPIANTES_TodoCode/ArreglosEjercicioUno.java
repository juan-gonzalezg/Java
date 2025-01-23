
import java.util.Scanner;

public class ArreglosEjercicioUno {
   public static void main(String[] args) {
      String vector[]=new String[8];
      Scanner teclado=new Scanner(System.in);
      for(int i=0; i<vector.length; i++){
         System.out.print("Ingrese el nombre que desea almacenar en la posicion "+i+": ");
         vector[i]=teclado.nextLine();
      }
      System.out.println("\nLos nombres almacenados:");
      for(int i=0; i<vector.length; i++){
         System.out.println("Indice: "+i+" Nombre almacenado: "+vector[i]);
      }
   }
}
