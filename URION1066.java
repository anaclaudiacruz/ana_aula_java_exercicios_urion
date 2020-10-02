import java.util.Scanner;
public class Urion1066{
   public static void main(String args[]){
   Scanner teclado = new Scanner(System.in);
		
   int contador, numero, qtpar, qtimpar, qtpositivo, qtnegativo;
    
   qtpar = 0;
   qtimpar = 0;
   qtpositivo = 0;
   qtnegativo = 0;
   contador = 1;

   while (contador <= 5){
       numero = teclado.nextInt();
       if (numero % 2 == 0) {
         qtpar += 1;
       } else {
         qtimpar += 1;
       }

       if (numero != 0) {
          if (numero > 0) {
            qtpositivo += 1;
          } else {
            qtnegativo += 1;
          }
       }

   contador++;
   }

   System.out.printf("%d valor(es) par(es)\n", qtpar);
   System.out.printf("%d valor(es) impar(es)\n", qtimpar);
   System.out.printf("%d valor(es) positivo(s)\n", qtpositivo);
   System.out.printf("%d valor(es) negativo(s)\n", qtnegativo);


   }
}