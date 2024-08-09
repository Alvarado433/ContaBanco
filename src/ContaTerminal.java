import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String Agencia;
        String nomeCliente;
        double Saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.println("           Conta Bancaria :         ");
        System.out.println("------------------------------------");

        System.out.println("Digite o numero da conta");
        numero = scanner.nextInt();

        System.out.println("digite a agencia: ");
        Agencia = scanner.next();

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.next();

        System.out.println("Digite o saldo:");
        Saldo = scanner.nextDouble();

        System.err.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é:  " 
        + Agencia + " conta : " + numero + "e seu saldo" +
         Saldo + "já está disponível para saque");

        scanner.close();
        
    }
}
