import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência:");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite a Agência:");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
