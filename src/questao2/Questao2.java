package questao2;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence a sequencia de Fibonacci");
        } else {
            System.out.println("O número " + numero + " não pertence a sequencia de Fibonacci");
        }

        scanner.close();

    }

    public static boolean pertenceFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int proximo = a + b;

        while (proximo <= numero) {
            if (proximo == numero ){
                return true;
            }

            a = b;
            b = proximo;
            proximo = a + b;
        }

        return false;
    }

}
