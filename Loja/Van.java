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
	 public void Printt(){

	        System.out.println("Placa: " + placa + "\n" +
	        "Modelo: " + modelo + "\n" +
	        "Cor: " + cor + "\n"  + "Marca: " +marca + "\n" +
	        "Com Cambio Automatico: " + cambio_automatico + "\n" +
	        "Ano: " + ano + "\n");
	    }
	public static void main(String[] args) {
		Van V1 = new Van("VVV9876", "Sprinter","AzuleVermelha", "Mercedes", true, 2012);
		Van V2 = new Van("FFF2341", "Combi", "Branca", "Volkswagen", false, 1998);
		Van V3 = new Van("QWE4536", "Sprinter","Branca", "Mercedes", true, 2013);
		
		V1.Printt();
		V2.Printt();
		V3.Printt();
		
		
	}
}
	
