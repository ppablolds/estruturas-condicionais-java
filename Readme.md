# Aulas de Estruturas e Condicionais em Java

Controle de fluxo é a habilidade de ajustar
a maneira que um programa realiza suas tarefas.
Por meio de intruções especiais, chamadas de comandos,
essas tarefas podem ser executadas seletivamente, repetidamente ou excepcionalmente.

### Classificação:
 - Estruturas condicionais: if-else, switch-case
 - Estruturas de repetição: for, while, do-while
 - Estruturas de exceções: try-catch-finally, throw

 #

 ### Estruturas condicionais

 A estrutura condicional possibilita a escolha de um grupo de ações e comportamentos a serem executadas quando determinadas condições são ou não satisfeitas. A Estrutura Condicional pode ser <strong>Simples</strong> ou <strong>Composta</strong>.

 ### Condicionais Simples

 Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva, consideramos como estrutura <strong>Simples</strong>.

 Exemplo:

 ```java
 public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
```
Deve retornar o valor 8.0

##

### Condicional Composta

Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução condicionado a uma regra de negócio, este cenário é denominado <strong>Estrtura Condicional Composta</strong>.

Exemplo: 

```java
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
```

Deve Retornar <strong>Reprovado!</strong>.