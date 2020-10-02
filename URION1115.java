import java.util.Scanner;
public class Urion1115{
   public static void main(String args[]){
   Scanner teclado = new Scanner(System.in);
		
   int X, Y;
    
   do {
      X = teclado.nextInt();
      Y = teclado.nextInt();

      if (X > 0 && Y > 0) {
         System.out.println("primeiro");
      } else if (X < 0 && Y > 0) {
         System.out.println("segundo");
      } else if (X < 0 && Y < 0) {
         System.out.println("terceiro");
      } else if (X > 0 && Y < 0) {
         System.out.println("quarto");
      }
   } while (X != 0 || Y != 0);

   }
}