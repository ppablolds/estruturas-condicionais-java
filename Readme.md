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

##

### Condicionais Encadeadas

Em um controle de fluxo condicional, nem sempre nos limitamos ao <strong>se</strong> (``if``) e <strong>senão</strong> (``else``), poderemos ter uma terceira, quarta ou inúmeras condições.

```java
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7) {
            System.out.println("Aprovado!");
        } else if(nota >= 5 && nota < 7) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
```

Deve imprimir Recuperação!.

##

### Condição Ternária

Como vimos em operadores, podemos abreviar nosso algorítmico condicional refatorando com o conceito de operador ternário. Vamos refatorar os exemplos acima para ilustrar o poder deste recurso: 

```java
// Cenário 1
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;

        String resultado = nota >= 7 ? "Aprovado!" : "Reprovado!";
        System.out.println(resultado);
    }
}
```

Deve retornar Aprovado!.

```java
// Cenário 2
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        String resultado = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Recuperação!" : "Reprovado!";
        System.out.println(resultado);
    }
}
```

Deve retornar Recuperação!.

##

### Switch Case

A estrutura switch compara o valor de caso com o da variável sequencialmente, e sempre que encontra um valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a serem executadas após um caso correspondente ter sido encontrado, acrescentamos o comando <strong>*break*</strong> no final de cada bloco de códigos. O comando <strong>*break*</strong>, quando executado, encerra a execuçao da estrutura onde ele se encontra.

Vamos imaginar que precisaremos imprimir uma medida com base em mapa de valores, exemplo:

| Sigla | Tamanho 
| ----- | ------- 
| P | Pequeno
| M | Médio
| G | Grande

```java
public class SistemaMedida {

    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P" ->  {
                System.out.println("PEQUENO");
            }
            case "M" ->  {
                System.out.println("MEDIO");
            }
            case "G" ->  {
                System.out.println("GRANDE");
            }
            default -> System.out.println("INDEFINIDO");
        }
    }
}
```

Deve retornar MEDIO.

Pórem um cenário que poderíamos adequar o uso do switch/case para melhorar nosso algorítimo seria conforme ilustração abaixo:

 O sistema terá 3 planos: BASIC, MIDIA, TURBO
 - BASIC: 100 minutos de ligação
 - MIDIA: 100 minutos de ligação + Whats e Instagram Grátis
 - TURBO: 100 minutos de ligação + Whats e Instagram Grátis + 5Gb Youtube

 ```java
 public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram Grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
 ```

Deve retornar Whats e Instagram Grátis, 100 minutos de ligação.