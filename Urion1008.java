import java.util.Scanner;
public class Urion1008 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int NumFunc, QtdeHoras;
        double ValorHora, ValorSalario;

        NumFunc = teclado.nextInt();
        QtdeHoras = teclado.nextInt();
        ValorHora = teclado.nextDouble();

        ValorSalario = QtdeHoras * ValorHora;

        System.out.println("NUMBER = " +NumFunc);
        System.out.printf("SALARY = U$ %.2f\n", +ValorSalario);
    }
}
