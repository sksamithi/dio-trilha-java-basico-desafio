/**
 * @author Thaís Macedo Vieira
 * @version 1.0
 * @since 26/06/2024
 */
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * Método para obtenção de dados de uma conta bancária em criação.
     */
    public static void main(String[] args) {
        //Criando objeto scanner.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o usuário.
        System.out.println("Seja Bem Vindo ao terminal de acesso do banco Pacífico");
        System.out.println("Por favor, insira a sua agência: ");
        //Obter pela classe scanner os valores digitados no terminal.
        String agencia = scanner.next();

        System.out.println("Por favor, insira o número da sua conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("Caro usuário, constatamos que sua conta não faz parte do escopo de clientes do banco.");
        System.out.println("Por favor, digite o seu nome completo para prosseguir com o procedimento de criar uma conta: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor do seu saldo inicial depositado com a vírgula sendo representado pelo ponto: ");
        double saldo = scanner.nextDouble();

        //Exibir mensagem de conta criado com sucesso.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        //Fechar scanner.
        scanner.close();
    }
}
