import java.util.Scanner;
public class Exec2 {
    public static void main(String args[]){

        Scanner teclado; // declarei um campo do tipo Scanner (chamei de teclado)
        teclado = new Scanner(System.in); // esse teclado lê o dispositivo de entrada padrão
//        Scanner teclado = new Scanner(System.in);

//      exercicio 2a
        float valor1, valor2;
        System.out.println(" ");
        System.out.println("Vamos calcular a area de um quadrado.");
        System.out.print("Digite o lado: ");
        valor1 = teclado.nextFloat();
        valor2 = valor1 * valor1;
        System.out.println("A area do quadrado e = "+valor2);
        
//      exercicio 2c
        float valora, valorb, valorc;
        System.out.println(" ");
        System.out.println("Agora vamos calcular a area de um triangulo");
        System.out.print("Digite a base: ");
        valora = teclado.nextFloat();
        System.out.print("Digite a altura: ");
        valorb = teclado.nextFloat();
        valorc = (valora * valorb)/2;
        System.out.println("A area do trinagulo e = "+valorc);

//      exercicio 2e
        float basemaior, basemenor, altura, area;
        System.out.println(" ");
        System.out.println("Agora vamos calcular a area de um trapezio");
        System.out.print("Digite a base maior: ");
        basemaior = teclado.nextFloat();
        System.out.print("Digite a base menor: ");
        basemenor = teclado.nextFloat();
        System.out.print("Digite a base altura: ");
        altura = teclado.nextFloat();
        area = (basemaior + basemenor) * altura / 2;
        System.out.println("A area do trapezio e = "+area);
        System.out.println(" ");

    }
}
