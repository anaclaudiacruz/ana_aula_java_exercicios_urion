import java.util.Scanner;
public class Urion1142{
   public static void main(String args[]){
   Scanner teclado = new Scanner(System.in);
		
   int contador, contador2, numero, incremento;

   incremento = 1;
   
   numero = teclado.nextInt();
   
      for (contador = 1; contador <= numero; contador+=1){
      for (contador2 = 1; contador2 <= 4; contador2+=1){
	   switch (contador2){
	    	case 1:
	    	case 2:
            case 3: 
               System.out.printf("%d ", incremento);
               incremento += 1;
               break;
            case 4:
               System.out.println("PUM");
               incremento += 1;
               break;
         }
      }
   }

   }
}