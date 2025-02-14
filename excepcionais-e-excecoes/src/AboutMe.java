import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digíte seu Nome: ");
            String nome = scanner.next();

            System.out.println("Digíte seu Sobre-Nome: ");
            String sobreNome = scanner.next();

            System.out.println("Digíte sua Idade: ");
            int idade = scanner.nextInt();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobreNome.toUpperCase());
            System.out.println("E tenho " + idade + " anos de idade.");
        } catch (InputMismatchException e) {
            System.out.println("O campo de Idade precisa ser numérico");
        }
    }
}
