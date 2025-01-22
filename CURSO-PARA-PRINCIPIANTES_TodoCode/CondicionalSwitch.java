
import java.util.Scanner;

public class CondicionalSwitch {
   public static void main(String[] args) {
      int dia;
      String nombreDia;
      Scanner teclado=new Scanner(System.in);
      System.out.print("Introduce un número del 1 al 7: ");
      dia=teclado.nextInt();
      switch(dia){
         case 1: nombreDia="Lunes";
                  break;
         case 2: nombreDia="Martes";
                  break;
         case 3: nombreDia="Miércoles";
                  break;
         case 4: nombreDia="Jueves";
                  break;
         case 5: nombreDia="Viernes";
                  break;
         case 6: nombreDia="Sábado";
                  break;
         case 7: nombreDia="Domingo";
                  break;
         default: nombreDia="Día incorrecto";
      }
      System.out.println("El día de la semana es: "+nombreDia);
   }
}
