import java.util.Scanner;
public class Urion1018 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, Resto, Notas100, Notas50, Notas20, Notas10, Notas5, Notas2, Notas1;

//      Valor
        N = teclado.nextInt();

        Notas100 = N / 100;
        Resto = N % 100;

        Notas50 = Resto / 50;
        Resto = Resto % 50;

        Notas20 = Resto / 20;
        Resto = Resto % 20;

        Notas10 = Resto / 10;
        Resto = Resto % 10;

        Notas5 = Resto / 5;
        Resto = Resto % 5;

        Notas2 = Resto / 2;
        Resto = Resto % 2;

        Notas1 = Resto;

        System.out.println(N);

        System.out.printf("%d nota(s) de R$ 100,00\n", +Notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", +Notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", +Notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", +Notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", +Notas5);
        System.out.printf("%d nota(s) de R$ 2,00\n", +Notas2);
        System.out.printf("%d nota(s) de R$ 1,00\n", +Notas1);

//      outra forma de printar
//        System.out.println(Notas100 + " nota(s) de R$ 100,00");
//        System.out.println(Notas50 + " nota(s) de R$ 50,00");
//        System.out.println(Notas20 + " nota(s) de R$ 20,00");
//        System.out.println(Notas10 + " nota(s) de R$ 10,00");
//        System.out.println(Notas5 + " nota(s) de R$ 5,00");
//        System.out.println(Notas2 + " nota(s) de R$ 2,00");
//        System.out.println(Notas1 + " nota(s) de R$ 1,00");

    }
}
