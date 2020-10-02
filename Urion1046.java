import java.util.Scanner;
public class Urion1046 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int HoraInicio, HoraFim, Intervalo;

        HoraInicio = teclado.nextInt();
        HoraFim = teclado.nextInt();

        if (HoraInicio > HoraFim) {
            Intervalo = (24 - HoraInicio) + HoraFim;
        } else if ( HoraInicio == HoraFim) {
            Intervalo = 24;
        } else {
            Intervalo = HoraFim - HoraInicio;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n", Intervalo);
    }
}
