import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.next();

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.next();
        scanner.nextLine(); // <--- Add this line to consume the newline character

        while (true) {
            try {
                System.out.print("Por favor, digite o saldo inicial: ");
                saldo = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: valor inválido. Por favor, digite um número válido.");
                scanner.next(); // discard invalid input
            }
        }

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}