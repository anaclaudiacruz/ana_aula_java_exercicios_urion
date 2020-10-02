import java.util.Scanner;
public class Urion1041 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float ValorDig;

        ValorDig = teclado.nextFloat();

        if (ValorDig > 100.00) {
            System.out.println("Fora de intervalo");
        } else if (ValorDig > 75.00) {
            System.out.println("Intervalo (75,100]");
        } else if (ValorDig > 50.00) {
            System.out.println("Intervalo (50,75]");
        } else if (ValorDig > 25.00) {
            System.out.println("Intervalo (25,50]");
        } else if (ValorDig >= 0) {
            System.out.println("Intervalo [0,25]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
