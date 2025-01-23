
import java.util.Scanner;

public class ArreglosEjercicioDos {
   public static void main(String[] args) {
      int vector[]=new int[10];
      //int mayor=0, menor=99999;
      int mayor=Integer.MIN_VALUE, menor=Integer.MAX_VALUE;
      Scanner teclado=new Scanner(System.in);
      for(int i=0; i<vector.length; i++){
         System.out.println("Ingrese el numero que desea cargar en la posicion "+i+": ");
         vector[i]=teclado.nextInt();
      }
      for(int i=0; i<vector.length; i++){
         if(vector[i]>mayor)
            mayor=vector[i];
         if(vector[i]<menor)
            menor=vector[i];
      }
      System.out.println("\nEl mayor número es: "+mayor);
      System.out.println("El menor número es: "+menor);
   }
}