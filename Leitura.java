import java.util.Scanner;
public class Leitura {
    public static void main(String args[]){

        Scanner teclado; // declarei um campo do tipo Scanner (chamei de teclado)
        teclado = new Scanner(System.in); // esse teclado lê o dispositivo de entrada padrão

        int valor1;

        System.out.print("Digite um valor inteiro ");
        valor1 = teclado.nextInt();
        System.out.println("Digitou o valor = "+valor1);

        float valor2;

        System.out.println("Agora digite um valor real = ");
        valor2 = teclado.nextFloat();
        System.out.println("Digitou o valor = %5.2f\n" +valor2);
    
    }
}
        
