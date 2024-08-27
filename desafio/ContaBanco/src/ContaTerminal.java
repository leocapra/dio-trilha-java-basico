import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Programa:'Por favor, digite seu nome !' ");
        String nome = scanner.nextLine();

        System.out.println("Programa:'Por favor, digite o número da Agência !' ");
        String agencia = scanner.next();

        System.out.println("Programa:'Por favor, digite seu saldo !' ");
        double saldo = scanner.nextDouble();

        System.out.println("Programa:'Por favor, digite número da conta ! ' ");
        int numero = scanner.nextInt();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
