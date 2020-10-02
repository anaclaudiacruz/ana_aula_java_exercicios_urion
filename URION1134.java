import java.util.Scanner;
public class Urion1134{
   public static void main(String args[]){
   Scanner teclado = new Scanner(System.in);
		
   int codigo, qtalcool, qtgasolina, qtdiesel;

   qtalcool = 0;
   qtgasolina = 0;
   qtdiesel = 0;
   codigo = 0;

   do {
      codigo = teclado.nextInt();
      switch (codigo){
         case 1:
             qtalcool += 1; 
            break;
         case 2:
            qtgasolina += 1;
            break;
         case 3:
            qtdiesel += 1;
            break;
      }
   } while (codigo != 4);
   
   System.out.println("MUITO OBRIGADO");
   System.out.printf("Alcool: %d\n", qtalcool);
   System.out.printf("Gasolina: %d\n", qtgasolina);
   System.out.printf("Diesel: %d\n", qtdiesel);

   }
}