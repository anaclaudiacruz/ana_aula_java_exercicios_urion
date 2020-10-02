import java.util.Scanner;
public class Urion1010 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int NumPeca1, QtdePeca1, NumPeca2, QtdePeca2;
        double ValorPeca1, ValorPeca2, ValorPagar;

        NumPeca1 = teclado.nextInt();
        QtdePeca1 = teclado.nextInt();
        ValorPeca1 = teclado.nextDouble();

        NumPeca2 = teclado.nextInt();
        QtdePeca2  = teclado.nextInt();
        ValorPeca2  = teclado.nextDouble();

        ValorPagar = (QtdePeca1 * ValorPeca1) + (QtdePeca2 * ValorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", +ValorPagar);
    }
}
