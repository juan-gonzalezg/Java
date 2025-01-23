
import java.util.Scanner;

public class Arreglos {
   public static void main(String[] args) {
      int numeros[]=new int[8];
      /*
      numeros[0]=15;
      numeros[1]=35;
      numeros[2]=22;
      numeros[3]=14;
      numeros[4]=64;
      numeros[5]=61;
      numeros[6]=91;
      numeros[7]=23;
      */
      Scanner teclado=new Scanner(System.in);
      for(int i=0; i<numeros.length; i++){
         System.out.print("Ingrese el valor para el indice "+i+": ");
         numeros[i]=teclado.nextInt();
      }
      System.out.println("\nLos valores ingresados fueron:");
      for(int i=0; i<numeros.length; i++){
         System.out.println("Estoy en el indice: "+i+" y el valor es: "+numeros[i]);
      }
   } 
}
