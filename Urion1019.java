import java.util.Scanner;
public class Urion1019 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, Horas, Minutos, Segundos, HorasX;

//      Qtde de segundos
        N = teclado.nextInt();

        Horas = N / 3600;

        Minutos = (N - ( Horas * 3600)) / 60 ;
        Segundos = (N - ( Horas * 3600) - (Minutos * 60));
        
//        System.out.printf("Horas %d \n", +Horas);
//        System.out.printf("Minutos %d \n", +Minutos);
//        System.out.printf("Segundos %d \n", +Segundos);

        System.out.printf("%d:%d:%d\n", +Horas, +Minutos, +Segundos);

    }
}
