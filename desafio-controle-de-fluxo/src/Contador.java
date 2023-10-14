import java.util.Locale;
import java.util.Scanner;

import customErrors.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite dois valores para usar o sistema do contador:");

        System.out.println("Digite o primeiro valor:");
        int valorUm = terminal.nextInt();
        System.out.println("Digite o segundo valor:");
        int valorDois = terminal.nextInt();

        try {
            contar(valorUm, valorDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        terminal.close();

    }

    static void contar(int valorUm, int valorDois) throws ParametrosInvalidosException {

        if (valorUm > valorDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = valorDois - valorUm;

        System.out.println("Fazendo a contagem de 1 a " + contagem);

        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}