package Loja;

public class Van {
	private String placa;
	private String modelo;
	private String cor;
	private String marca;
	private boolean cambio_automatico;
	private int ano;
	private float preco;
	
	public Van(String placa,String mod,String cor,String marca, boolean camb, int ano) {
		this.placa=placa;
		modelo=mod;
		this.cor=cor;
		this.marca=marca;
		cambio_automatico=camb;
		this.ano=ano;		
	}
	public static void main(String[] args) {
		Funcionarios V1 = new Van("VVV9876", "Sprinter","AzuleVermelha", "Chevrolet", true, 2012);
		Funcionarios V2 = new Van("FFF2341", "Combi", "Branca", "Volkswagen", false, 1998);
		Funcionarios V3 = new Van("QWE4536", "Sprinter","Branca", "Chevrolet", true, 2013);
}
	
