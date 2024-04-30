import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Bem vindo ao Terminal Bank.\n");
        System.out.println("Por favor, Insira o numero de sua conta: ex: (1452) \n ");

        numero = sc.nextInt();

        System.out.println("Agora digite o numero de sua Agencia: ex: (145-2) \n ");
        agencia = sc.next();

        System.out.println("Informe o nome do cliente \n");
        nomeCliente = sc.next();

        System.out.println(" Agora me informe seu saldo:  ");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.println("Olá," + nomeCliente + "\n Obrigado por criar uma conta" +
                " no Terminal Bank\n" + "Sua conta: " + numero + "\n Agencia: " + agencia +
                "\n Saldo Atual: " + saldo + "\n Obrigado pela Preferencia\n");

        sc.close();
    }
}
