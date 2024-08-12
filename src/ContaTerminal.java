import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner (System.in);

        System.out.println("Informe o número da conta.");
        int numero = ler.nextInt();
        
        System.out.println("Informe o número da Agência com dígito.");
        String agencia = ler.nextLine();

        System.out.println("Informe o nome completo do titular.");
        String nomeCliente = ler.nextLine();

        System.out.println("Informe o valor do depósito.");
        float saldo = ler.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$"+saldo+" já está disponível para saque");


    }
}
