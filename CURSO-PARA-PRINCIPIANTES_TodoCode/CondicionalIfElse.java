
import java.util.Scanner;

public class CondicionalIfElse {
   public static void main(String args[]) {
      int edad;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Ingrese su edad: ");
      edad=teclado.nextInt();
      if(edad>18){
         System.out.println("Usted es mayor de edad");
         if(edad>40)
            System.out.println("Usted es un adulto mayor");
         else
            System.out.println("Usted es un adulto joven");
      }else{
         if(edad==18)
            System.out.println("Usted tiene 18 años");
         else
            System.out.println("Usted es menor de edad");
      }
   }   
}
