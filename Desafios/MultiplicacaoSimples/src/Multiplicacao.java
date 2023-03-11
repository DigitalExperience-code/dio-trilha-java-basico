import java.util.Locale;
import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int valor1, valor2, prod;
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        
        prod = valor1 * valor2;
        
        System.out.println("O produto entre os valores é: " + prod);

        scanner.close();
    }
}
