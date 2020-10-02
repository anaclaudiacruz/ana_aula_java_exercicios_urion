import java.util.Scanner;
public class Urion1070{
   public static void main(String args[]){
   Scanner teclado = new Scanner(System.in);
		
   int contador, numero, qtimpar;
    
   qtimpar = 0;
   contador = 1;

   numero = teclado.nextInt();

   while (qtimpar < 6){
      if (numero % 2 != 0) {
         System.out.println(numero);
         qtimpar += 1;
      }
      numero++;
   }

   }
}