import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner leia = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nome_cliente;
        double saldo = 0;

        System.out.println(" Informe o Nome do Cliente: ");
        nome_cliente = leia.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        agencia=leia.nextLine();

        System.out.println("Informe o numero da conta: ");
        numero = leia.nextInt();
        
        

        System.out.println("Informe o saldo: ");
        saldo = leia.nextDouble();

        System.out.println("Olá ".concat(nome_cliente) );
        System.out.println(" obrigado por criar uma conta em nosso banco a sua agencia é  ".concat(agencia)+ " e o numero é " + numero + " o Saldo é " + saldo);

        


        leia.close();
    }
}
