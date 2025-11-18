import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Conta!");

        // Obter pela scanner os valores digitados no terminal
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();
        
        scanner.nextLine(); 

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();
        
        // Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar a scanner
        scanner.close();
    }
}
