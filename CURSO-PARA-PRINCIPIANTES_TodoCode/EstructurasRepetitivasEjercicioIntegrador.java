
import java.util.Scanner;

public class EstructurasRepetitivasEjercicioIntegrador {
   public static void main(String[] args) {
      String placa="";
      int tipoServicio, cantidadHoras, contadorServico1=0, contadorServico2=0, contadorServico3=0;
      double montoTotal, totalDia=0;
      Scanner teclado=new Scanner(System.in);
      while(!placa.equalsIgnoreCase("fin")){
         System.out.print("Ingrese la placa de su vehículo: ");
         teclado=new Scanner(System.in);
         placa=teclado.nextLine();
         if(!placa.equalsIgnoreCase("fin")){
            System.out.println("\nIngrese el tipo de servicio:");
            System.out.println("1. Por hora");
            System.out.println("2. Media jornada (5 horas)");
            System.out.println("3. Jornada completa (10 horas)");
            teclado=new Scanner(System.in);
            System.out.print("Opcion: ");
            tipoServicio=teclado.nextInt();
            if(tipoServicio<=0 || tipoServicio>3)
               System.out.println("\nNo ingreso un tipo de servicio correcto\n");
            else{
               if (tipoServicio==1) {
                  System.out.print("\nIngrese la cantidad de horas que desea estacionar: ");
                  cantidadHoras=teclado.nextInt();
                  montoTotal=cantidadHoras*3;
                  System.out.println("El monto total de su estacionamiento es de: $"+montoTotal+" USD");
                  contadorServico1++;
               }else{
                  if(tipoServicio==2){
                     System.out.println("El servicio de media jornada corresponde a 5 horas y posee un descuento de 5%");
                     montoTotal=15-(15*0.05);
                     System.out.println("El monto total de su estacionamiento es de $"+montoTotal+" USD");
                     contadorServico2++;
                  }else{
                     System.out.println("El servicio de jornada completa corresponde a 10 horas y posee un descuento de 10%");
                     montoTotal=30-(30*0.10);
                     System.out.println("El monto total de su estacionamiento es de $"+montoTotal+" USD");
                     contadorServico3++;
                  }
               }
               totalDia+=montoTotal;
               System.out.println("\n*********Gracias por preferirnos!*********\n\n");
            }
         }
      }
      System.out.println("==============================================================================");
      System.out.println("Totales Monetarios Del Dia:");
      System.out.println("Cantidad Servicios por Hora: "+contadorServico1);
      System.out.println("Cantidad Servicios de Media Jornada: "+contadorServico2);
      System.out.println("Cantidad Servicios de Jornada Completa: "+contadorServico3);
      System.out.println("El monto total recaudado del dia es de: $"+totalDia+" USD");
   }
}
