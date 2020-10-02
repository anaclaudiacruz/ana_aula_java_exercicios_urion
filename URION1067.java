import java.util.Scanner;
public class Urion1067{
   public static void main(String args[]){
   Scanner teclado = new Scanner(System.in);
		
   int contador, numero, qtimpar;
    
   qtimpar = 0;
   contador = 1;

   numero = teclado.nextInt();

   while (contador <= numero){
      if (contador % 2 != 0) {
         System.out.println(contador);
         qtimpar += 1;
      }
      contador++;
   }

   }
}