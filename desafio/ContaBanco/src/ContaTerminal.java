import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Programa:'Por favor, digite o número da Agência !' ");
        String agencia = scanner.next();

        System.out.println("Programa:'Por favor, digite número da conta ! ' ");
        Int numero = scanner.next();

        System.out.println("Programa:'Por favor, digite seu nome !' ");
        String nome = scanner.next();

        System.out.println("Programa:'Por favor, digite seu saldo !' ");
        Double saldo = scanner.next();
        
    }
}
