import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Todo conhecer e importar a classe Scanner
            Scanner agencia = new Scanner(System.in);
            Scanner conta = new Scanner (System.in);
            Scanner nome = new Scanner(System.in);
            Scanner saldo = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário e obter pela classe scanner os valores digitados no terminal
        System.out.print("Informe o número da conta: ");
        int num = conta.nextInt();
        System.out.print("Informe o número da agência: ");
        String ag = agencia.next();
        System.out.print("Informe o nome do cliente: ");
        String cliente = nome.nextLine();
        System.out.print("Informe o saldo: ");
        double sal = saldo.nextDouble();
        
        
        //Exibir a mensagem conta criada
        System.out.print("Olá " + cliente + " obrigado por criar uma conta em nosso banco, sua agência é " + ag + ", conta " + num + " e seu saldo R$" + sal + " já disponível para saque." );

    }
}
