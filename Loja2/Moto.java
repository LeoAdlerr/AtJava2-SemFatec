package Loja;

public class Moto {
	private String placa;
	private String modelo;
	private String cor;
	private String marca;
	private int ano;
	private float preco;
	
	public Moto(String placa,String mod,String cor,String marca, int ano) {
		this.placa=placa;
		modelo=mod;
		this.cor=cor;
		this.marca=marca;
		this.ano=ano;		
	}
	public static void main(String[] args) {
		Moto M1 = new Moto("VVC1976", "Ninja","Verde", "Kawasaki", 2018);
		Moto M2 = new Moto("FTF2391", "Pop100", "Vermelha", "Honda", 2005);
		Moto M3 = new Moto("JWE4506", "Fazer","Preta", "Yamaha", 2013);
		
		System.out.println("M1= "+M1.placa+","+M1.modelo+","+M1.cor+","+M1.marca+","+M1.ano);
		System.out.println("M2= "+M2.placa+","+M2.modelo+","+M2.cor+","+M2.marca+","+M2.ano);
		System.out.println("M3= "+M3.placa+","+M3.modelo+","+M3.cor+","+M3.marca+","+M3.ano);
}
}
	
