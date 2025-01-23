
import java.util.Scanner;

public class Matrices {
   public static void main(String[] args) {
      int matriz[][]=new int[3][3];
      Scanner teclado=new Scanner(System.in);
      for(int i=0; i<matriz.length; i++){
         for(int j=0; j<matriz[0].length; j++){
            System.out.print("Ingrese el valor para la fila "+i+" columna "+j+": ");
            matriz[i][j]=teclado.nextInt();
         }
      }
      for(int i=0; i<matriz.length; i++){
         for(int j=0; j<matriz[0].length; j++){
            System.out.println("Fila: "+i+" Columna: "+j+" Valor: "+matriz[i][j]);
         }
      }
   }
}
