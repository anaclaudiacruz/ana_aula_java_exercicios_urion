import java.util.Scanner;
public class Urion1143{
   public static void main(String args[]){
   Scanner teclado = new Scanner(System.in);
		
   int contador, numero;

   numero = teclado.nextInt();
   
   for (contador = 1; contador <= numero; contador+=1){
      System.out.printf("%d %d %d\n", contador, contador*contador, contador*contador*contador);
   }

   }
}