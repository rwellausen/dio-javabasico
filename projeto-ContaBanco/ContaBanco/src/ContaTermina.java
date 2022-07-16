
import java.util.Scanner;
public class ContaTermina {
    public static void main(String[] args) {

        //criando o objeto scanner

        Scanner nc = new Scanner(System.in);

        // declarando variáveis necessárias 

        int Agencia;
        int Conta;
        String nomeCliente	;
        int Saldo;

        //capturando informações pelo usários

        System.out.println("Seja bem Vindo ao banco Teste da Dio \n");
        System.out.println("Por gentileza nos Informe o seu Nome: ");
        nomeCliente = nc.nextLine();
        System.out.println("Gentileza nos informe o número da sua Agencia: ");
        Agencia = nc.nextInt();
        System.out.println("gentileza nos informe o número da sua Conta Corrente: ");
        Conta = nc.nextInt();
        System.out.println("Gentileza informar o seu valor inicial de abertura de conta: ");
        Saldo = nc.nextInt();

        //informando mensagem de texto.
        System.out.println("Prezado Sr."+ nomeCliente+" Seja Bem Vindo ao banco DIO. Seus dados bancários foram validados e seguem a seguir: \n"+
        "Sua agência será: " + Agencia+" "+"Sua conta corrente será: "+Conta+" "+"Seu saldo será inicial será de : R$ "+Saldo
        );

        
    }
}