import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Scanner captura a entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declara as variáveis para armazenar os dados da conta
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        // Captura e armazena o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();
        
        // Captura e armazena a agência
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.next();
        
        // Captura e armazena o nome do cliente
        System.out.print("Por favor, digite o seu Nome: ");
        scanner.nextLine();  // Consumir a quebra de linha pendente
        nomeCliente = scanner.nextLine();
        
        // Captura e armazena o saldo
        System.out.print("Por favor, digite o Saldo inicial: ");
        saldo = scanner.nextDouble();
        
        // Fecha o scanner 
        scanner.close();
        
        // Exibe a mensagem final com os dados inseridos pelo usuário
        String mensagem = "Olá ".concat(nomeCliente)
                             .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                             .concat(agencia)
                             .concat(", conta ")
                             .concat(String.valueOf(numero))
                             .concat(" e seu saldo ")
                             .concat(String.valueOf(saldo))
                             .concat(" já está disponível para saque.");
        
        System.out.println(mensagem);
    }
}