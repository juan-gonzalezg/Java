
import java.util.Scanner;

public class ArreglosEjercicioCuatro {
   public static void main(String[] args) {
      double sueldo[]=new double[12];
      double totalSueldo=0;
      double promedioSueldo;
      Scanner teclado=new Scanner(System.in);
      for(int i=0; i<sueldo.length; i++){
         System.out.println("Ingrese el sueldo del mes "+(i+1)+": ");
         sueldo[i]=teclado.nextDouble();
      }
      for(int i=0; i<sueldo.length; i++){
         totalSueldo+=sueldo[i];
      }
      promedioSueldo=totalSueldo/sueldo.length;
      System.out.println("La suma total de sus 12 sueldos es: $"+totalSueldo+" USD");
      System.out.println("El promedio de su sueldo en el año es: $"+promedioSueldo+" USD");
   }
}
