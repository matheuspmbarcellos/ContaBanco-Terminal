import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
				
		int num;
		System.out.printf("Digite o número da conta:\n");
		num = ler.nextInt();
		
		int ag;
		System.out.printf("Digite o número da agência:\n");
		ag = ler.nextInt();
		
		String nome;
		System.out.printf("Digite o nome do cliente:\n");
		nome = ler.next();
		
		String sobrenome;
		System.out.printf("Digite o sobrenome do cliente:\n");
		sobrenome = ler.next();
		
		double saldo;
		System.out.printf("Valor de depósito:\n");
		saldo = ler.nextDouble();
		
		System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + ag + ", conta " + num + " e seu saldo " + saldo + " já está disponível para saque.");

	}

}
