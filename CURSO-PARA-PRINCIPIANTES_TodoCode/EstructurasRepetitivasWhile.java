
import java.util.Scanner;

public class EstructurasRepetitivasWhile {
   //while
   public static void main(String[] args) {
      int contador=0;
      while(contador<10){
         System.out.println("Estoy en la vuelta Nro "+contador);
         contador++;
      }

      boolean bandera=true;
      Scanner teclado=new Scanner(System.in);
      String respuesta;
      while(bandera==true){
         System.out.println("El valor de mi bandera es: "+bandera);
         System.out.println("Estas actualmente inscrito en la academia? "+bandera);
         System.out.print("Quiere retirarte de la academia? (si o no): ");
         respuesta=teclado.next();
         if(respuesta.equalsIgnoreCase("si"))
            bandera=false;
         System.out.println("-------------------------------------------------");
      }
   }
}
