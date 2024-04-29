import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Operadores {
    public static void main(String[] args) {

        // OPERADORES DE ATRIBUIÇÃO ' = '

        String nome = "Marciel";
        int idade = 29;
        double peso = 70;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // OPERADORES ARITMETICOS ' + (ADICAO), - (SUBTRACAO), * ( MULTIPLICAO), / (DIVISAO)'

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        double resultado = (10 * 7) + (20 / 4);

        // PS: OPERADOR DE ADIÇÃO PODE SER UTILIZADO PARA CONCATENAÇÃO COM STRINGS E VARIAVEIS EX A BAIXO

        System.out.println("Resultado Soma: " + soma);
        System.out.println("Resultado Subtracao: " + subtracao);
        System.out.println("Resultado Multiplicacao: " + multiplicacao);
        System.out.println("Resultado Divisao: " + divisao);
        System.out.println("Resultado Resultado: " + resultado);

        String nomeCompleto = "Linguagem" + " " + "Java";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + "1" + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        // OPERADORES UNÁRIOS INCLEMENTO E DECLEMENTO NUMERICOS E BOOLEANOS
        // + UNARIO POSITIVO
        // - UNARIO NEGATIVO
        // ++ INCLEMENTO
        // -- DECLEMENTO
        // ! NEGACAO

        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = +numero;

        System.out.println(numero);

        numero++;

        System.out.println(numero);

        numero--;

        System.out.println(numero);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        // OPERADORES TERNARIO

        int a, b;
        a = 5;
        b = 7;
        /*
        if( a == b )
            resposta = "verdadeiro";
        else
            resposta = "falso";
        */
        String resposta = a == b ? "verdadeiro" : "falso";

        System.out.println(resposta);

        // OPERADORES RELACIONAIS ' == IGUAL ', ' != DIFERENTE ', ' > MAIOR', < MENOR', >= MAIOR OU IGUAL, <= MENOR OU IGUAL

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.println("numero1 e maior que numero2");
        if (numero2 > numero1)
            System.out.println("numero2 e maior que numero1");
        if (numero1 >= numero2)
            System.out.println("numero1 e maior ou igual numero2");
        if (numero1 <= numero2)
            System.out.println("numero1 e menor ou igual numero2");
        if (numero1 == numero2)
            System.out.println("numero1 e igual a numero2");

        // OPERADORES LOGICOS '&& AND' '|| OU'

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2)
            System.out.println("as duas sao verdadeiras");

        if (condicao1 || condicao2)
            System.out.println("uma das condicoes e verdadeira");

    }


}