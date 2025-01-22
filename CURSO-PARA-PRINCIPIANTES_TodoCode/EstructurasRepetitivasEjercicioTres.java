public class EstructurasRepetitivasEjercicioTres {
   public static void main(String[] args) {
      int secuencia=200;
      while(secuencia<=250){
         System.out.print(secuencia);
         if (secuencia!=250)
            System.out.print(", ");
         else
            System.out.println(".");
         secuencia+=2;
      }
   }
}
