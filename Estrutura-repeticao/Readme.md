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