package sistemaBancario;

import java.util.Locale;
import java.util.Scanner;

import entities.account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        account account;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a conta e nome ");
		int conta=sc.nextInt();
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("deseja fazer um deposito inicial?");
		char resp = sc.next().charAt(0);
		if(resp =='s') {
			sc.nextLine();
			double depositoiInicial=sc.nextDouble();
			account =new account(conta, nome, depositoiInicial);
			
		}
		else {
			account = new account(conta, nome);
		}
		System.out.println(account);
		System.out.println("quanto deseja depositar");
		double deposito =sc.nextDouble();
		account.deposito(deposito);
		System.out.println("valores adicionados");
		System.out.println(account);
		System.out.println("quantos deseja sacar");
		double saque=sc.nextDouble();
		account.saque(saque);
		System.out.println(account);
	    sc.close();
	}
}
	    	
	    
	

	

