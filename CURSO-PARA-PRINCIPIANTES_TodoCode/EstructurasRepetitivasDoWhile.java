public class EstructurasRepetitivasDoWhile {
   public static void main(String[] args) {
      int contador = 0;
      do { 
         System.out.println("Estoy en la vuelta Nro " + (contador + 1));
         contador++;
      } while (contador < 10);
   }
}
