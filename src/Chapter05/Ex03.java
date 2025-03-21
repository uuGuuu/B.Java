package Chapter05;

// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("Digite um número: ");

        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0) {
            System.out.println(A + " É múltiplo de " + B);
        } else if (B % A == 0) {
            System.out.println(B + " É múltiplo de " + A);
        }
        else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}
