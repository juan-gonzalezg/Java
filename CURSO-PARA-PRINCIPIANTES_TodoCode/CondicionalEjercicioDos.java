
import java.util.Scanner;

public class CondicionalEjercicioDos {
   public static void main(String[] args) {
      int cantidadPaquetes;
      double costoCompra, costoFaltante, nuevoMonto, descuento;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Ingrese la cantidad de paquetes: ");
      cantidadPaquetes = teclado.nextInt();
      if (cantidadPaquetes < 5) {
         if (cantidadPaquetes < 0)
            System.out.println("No se permiten compras de cantidades negativas de paquetes");
         else
            System.out.println("No se permiten ventas menores a 5 paquetes");
      } else {
         System.out.print("Ingrese el costo total de la compra: ");
         teclado = new Scanner(System.in);
         costoCompra = teclado.nextDouble();
         if (cantidadPaquetes >=5 && cantidadPaquetes <= 15) {
            System.out.println("\nEl costo de envio es de $10 USD");
            costoCompra = costoCompra + 10;
         } else
            System.out.println("\nEl envio es gratis\n");
         if (costoCompra < 100) {
               System.out.println("No hay promociones");
               costoFaltante = 100 - costoCompra;
               System.out.println("Necesitas $" + costoFaltante + " USD para poder entrar a una promoción");
         } else {
            if (costoCompra >= 100 && costoCompra <= 300){
               descuento = costoCompra * 0.05;
               nuevoMonto = costoCompra - descuento;
               System.out.println("Posee un descuento del 5% equivalente a $" + descuento + " USD sobre el total de la compra");
               System.out.println("El nuevo monto total de la compra con descuento es: $" + nuevoMonto + " USD");
            } else {
               if (costoCompra > 300) {
                  descuento = costoCompra * 0.10;
                  nuevoMonto = costoCompra - descuento;
                  System.out.println("Posee un descuento del 10% equivalente a $" + descuento + " USD sobre el total de la compra");
                  System.out.println("El nuevo monto total de la compra con descuento es: $" + nuevoMonto + " USD");
               }
            }
         }
      }
   }
}
