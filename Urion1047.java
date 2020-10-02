import java.util.Scanner;
public class Urion1047 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hI, hF, mF, mI, dH, dM, total, tempoI, tempoF;

        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        tempoI = hI * 60 + mI;
        tempoF = hF * 60 + mF;

        total = tempoF - tempoI;

        if (total <= 0) {
            total = total + 24 * 60;
        }

        dH = total / 60;
        dM = total % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", dH, dM);

        // checar outra forma de concatenar os valores
    }
}
