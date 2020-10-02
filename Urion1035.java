import java.util.Scanner;

/*
Leia 4 valores inteiros A, B, C e D. 

A seguir, se B for maior do que C                   e  - condição 1
se D for maior do que A,                            e  - condição 2
a soma de C com D for maior que a soma de A e B     e  - condição 3
se C e D, ambos, forem positivos                    e  - condição 4
se a variável A for par                                - condição 5

escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
*/

public class Urion1035 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

//           (1)         (2)        (3)                (4)                 (5)
        if ( ( B > C) && (D > A) && (C + D > A + B) && (C > 0 && D > 0) && (A % 2 == 0) ) {
            System.out.println("Valores aceitos");
        } 
        else{
            System.out.println("Valores nao aceitos");
        }        
    }
}


