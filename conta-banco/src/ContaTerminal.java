import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner captura a entrada de dados do usuário

        int numero;
        String agencia;
        String nomeCliente;
        double saldo; // Declarar as variáveis para armazenar os dados da conta

        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt(); // Captura e armazena o número da conta

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.next(); // Captura e armazena a agência

        System.out.print("Por favor, digite o seu Nome: "); // Captura e armazena o nome do cliente
        scanner.nextLine(); // Consumir a quebra de linha pendente
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo inicial: "); // Captura e armazena o saldo
        saldo = scanner.nextDouble();

        scanner.close(); // Fecha o scanner

        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque.");

        System.out.println(mensagem); // Exibe a mensagem final com os dados inseridos pelo usuário
    }
}

// PROJETO FINAL