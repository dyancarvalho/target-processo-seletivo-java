import java.util.Scanner;

public class SegundaSolucao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        boolean pertence = verificaFibonacci(numero);

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean verificaFibonacci(int numero) {
        int anterior = 0;
        int atual = 1;

        while (atual < numero) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual == numero;
    }
}
