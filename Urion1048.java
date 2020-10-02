/*
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

Salário	                Percentual de Reajuste
0 - 400.00              15%
400.01 - 800.00         12%
800.01 - 1200.00        10%
1200.01 - 2000.00       7%
Acima de 2000.00        4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.

*/

import java.util.Scanner;
public class Urion1048 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double Salario, SalarioNovo, Reajuste;

        Salario = teclado.nextFloat();

        if (Salario > 2000.00) {
            Reajuste = Salario * 0.04;
            SalarioNovo = Salario * 1.04;
            System.out.printf("Novo salario: %.2f\n", SalarioNovo);
            System.out.printf("Reajuste ganho: %.2f\n", Reajuste);
            System.out.println("Em percentual: 4 %");
        } else if (Salario > 1200.00) {
            Reajuste = Salario * 0.07;
            SalarioNovo = Salario * 1.07;
            System.out.printf("Novo salario: %.2f\n", SalarioNovo);
            System.out.printf("Reajuste ganho: %.2f\n", Reajuste);
            System.out.println("Em percentual: 7 %");
        } else if (Salario > 800.00) {
            Reajuste = Salario * 0.10;
            SalarioNovo = Salario * 1.10;
            System.out.printf("Novo salario: %.2f\n", SalarioNovo);
            System.out.printf("Reajuste ganho: %.2f\n", Reajuste);
            System.out.println("Em percentual: 10 %");
        } else if (Salario > 400.00) {
            Reajuste = Salario * 0.12;
            SalarioNovo = Salario * 1.12;
            System.out.printf("Novo salario: %.2f\n", SalarioNovo);
            System.out.printf("Reajuste ganho: %.2f\n", Reajuste);
            System.out.println("Em percentual: 12 %");
        } else {
            Reajuste = Salario * 0.15;
            SalarioNovo = Salario * 1.15;
            System.out.printf("Novo salario: %.2f\n", SalarioNovo);
            System.out.printf("Reajuste ganho: %.2f\n", Reajuste);
            System.out.println("Em percentual: 15 %");
        }
    }
}