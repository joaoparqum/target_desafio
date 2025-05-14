package questao5;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String original = scanner.nextLine();

        String invertida = inverter(original);

        System.out.println("String invertida: " + invertida);

        scanner.close();
    }

    public static String inverter(String texto) {
        String resultado = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }

        return resultado;
    }
}
