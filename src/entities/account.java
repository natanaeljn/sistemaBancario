package entities;

public class account {
private  int conta;
private String nome;
private double depositoiInicial;
public account(int conta, String nome, double depositoiInicial) {
	
	this.conta = conta;
	this.nome = nome;
	this.depositoiInicial = depositoiInicial;
}
public account(int conta, String nome) {
	
	this.conta = conta;
	this.nome = nome;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getConta() {
	return conta;
}
public void deposito( double deposito) {
	this.depositoiInicial += deposito;
}
public void saque(double saque)	{
	this.depositoiInicial -= saque - 5;
}
public String toString() {
	return "conta :"
			+conta
			+"\n"
			+"nome:"
			+nome
			+"\n"
			+"total disponivel:"
			+String.format("%.2f", depositoiInicial);
}










}
	
	
	
	


