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
		Van V1 = new Van("VVV9876", "Sprinter","AzuleVermelha", "Mercedes", true, 2012);
		Van V2 = new Van("FFF2341", "Combi", "Branca", "Volkswagen", false, 1998);
		Van V3 = new Van("QWE4536", "Sprinter","Branca", "Mercedes", true, 2013);
		
		System.out.println("V1= "+V1.placa+","+V1.modelo+","+V1.cor+","+V1.marca+","+V1.cambio_automatico+","+V1.ano);
		System.out.println("V2= "+V2.placa+","+V2.modelo+","+V2.cor+","+V2.marca+","+V2.cambio_automatico+","+V2.ano);
		System.out.println("V3= "+V3.placa+","+V3.modelo+","+V3.cor+","+V3.marca+","+V3.cambio_automatico+","+V3.ano);
}
}
	
