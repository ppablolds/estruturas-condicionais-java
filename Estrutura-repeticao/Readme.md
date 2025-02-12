# Estrutura de repetição

Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem a iteração de codígo, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.

##

Laços ou repetições são representados pelas seguintes estruturas: 
 - <strong>*For*</strong> (para)
 - <strong>*While*</strong> (enquanto)
 - <strong>*Do While*</strong> (faça enquanto)

 ##

 ### <strong>*For*</strong>

 O comando `for` (na tradução literal para a língua portuguesa é "para") permite que uma variável contadora seja testade e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando `for` recebe como entrada uma variável contadora, a condição e o valor de incrementação.

 A estrutura de sintaxe do controle de repetição `for` é exibida abaixo:

 ```java
 // Estrutura de controle de fluxo for

 for (bloco de inicialização; expressão boleana de validação; bloco de atualização) {
    // Comando que será executado até que a expressão de validação torne-se falsa
 }
 ```
 
 Vamos imaginar que Joãozinho precisa contar até 20 carneirinhos para pegar no sono:

 ```java
public class ExemploFor {
    public static void main(String[] args) {
        for(int carneiro = 0; carneiro <= 20; carneiro++) {
            System.out.println("Contando carneiro: " + carneiro);
        }

        System.out.println("Joãozinho Dormiu!");
    } 
}
 ```

 Também usamos o `for` para interagir sobre arrays e coleções:

 ```java
 public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Pablo", "Biano", "Rebeca" };

        for(int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
        }
    }
}
 ```

 ##

 ### Break e Continue

 <strong>Break</strong> significa parar, quebrar, frear, interromper. E é isso que se faz quando o Java encontra esse comando pela frente. <strong>Continue</strong>, como o nome diz, ele "continua" o laço. O comando `break` interrompe o laço, já o `continue` interrompe somente a iteração atual.

 ```java
 public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero++) {
            if(numero == 3) break;
            System.out.println(numero);
        }
    }
}
 ```
Deve retornar 2.

```java
public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero++) {
            if(numero == 3) continue;
            System.out.println(numero);
        }
    }
}
```