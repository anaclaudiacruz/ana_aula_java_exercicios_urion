import java.util.Scanner;
public class Urion1065{
	public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);
		
    int contador, qtdpares, numero;
    
    qtdpares = 0;
    numero = 0;

    contador = 1;
    while (contador <= 5){
        numero = teclado.nextInt();
        if ( numero % 2 == 0 ) {
           qtdpares += 1;
        }
    	contador++;
    }
    System.out.printf("%d valores pares\n", qtdpares);

	}
}