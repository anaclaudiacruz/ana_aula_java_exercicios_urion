/*
18. Faça um programa que leia duas notas bimestrais de um aluno, calcule sua média e
imprima:
 se média entre 9 e 10 aprovado com conceito A
 se média entre 8 e 9 aprovado com conceito B
 se média entre 6 e 8 aprovado com conceito C
 se média entre 3 e 6 em exame
 se média menor que 3 reprovado 
*/
import java.util.Scanner;
public class Exec18 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int Nota1, Nota2, C, D;

        System.out.println("Digite a primeira nota: ");
        Nota1 = teclado.nextInt();

        System.out.println("Digite a segunda nota: ");
        Nota2 = teclado.nextInt();
    }
}
