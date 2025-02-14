### Aula de Estrutura de Excepcionais e tratamento de exceções

##

### Exceções

Ao executar o código java, diferentes erros podem acontecer: erros de códificação feitos pelo programador, erros devido a entrada errada ou outros imprevistos.

Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java laçará uma <strong>exceção</strong> (jogará um erro).

De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente. Já exceções é um fluxo inesperado da nossa aplicação, exemplo: Querer dividir um valor por zero, querer abrir um arquivo que não existe, abrir uma conexão de um banco com o usuário ou senha inválida. Todos esses cenários e os demais não são erros mas sim fluxos não previsto pela aplicação.

É ai que entra mais uma resposabilidade do desenvolvedor, prever situações iguais a estas e realizar o que denominamos como <strong>Tratamento de exceções</strong>.

```java
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digíte seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digíte seu Sobre-Nome: ");
        String sobreNome = scanner.next();

        System.out.println("Digíte sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobreNome.toUpperCase());
        System.out.println("E tenho " + idade + " anos de idade.");
    }
}
```

Aparentemente é um programa simples, mas vamos listar alguns possiveis exceções que podem acontecer.

 - Não informar nome e sobrenome
 - O valor da idade ter um caractere NÂO numérico

Executando o nosso programa com os valores abaixo, vamos entender qual exceção acontecerá:

| Entrada | Valor | Exceção |
| ------- | ----- | ------- |
| Digíte seu nome: | Pablo |  |
| Digíte seu sobrenome: | Silva |  |
| Digíte sua idade: | Dezoito (18) | Java.util.InputMismatchException |

##

### Conhecendo algumas exceções já mapeadas

| Exceções | Causa |
| ---------| ------|
| java.lang.NullPointerException | Quando tentamos obter alguma informação de uma variavel nula. |
| java.lang.ArithmeticException  | Quando tentamos dividir um valor por 0. |
| java.sql.SQLException | Quando existe algum erro relacionado a integração com banco de dados. |
| java.io.FileNotFoundException | Quando tentamos ler ou escrever em um arquivo que não existe. |

##

### Tratamento de exceções

E quando inevitavelmente ocorrer uma exceção? Como nós desenvolvedores podemos ajustar nosso algoritimo para amenizar o ocorrido?

A instrução `try` permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.

A instrução `catch` permite definir um bloco de código a ser executado, caso ocorra um erro no bloco `try`.

A instrução `finally` permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. As palavras-chave `try` e `catch` vêm em pares:

Estrutura de um bloco com try e catch

```java
try {
    // bloco de código conforme esperado
} catch (exception e) {
    // bloco de código que captura as exceções
}
```