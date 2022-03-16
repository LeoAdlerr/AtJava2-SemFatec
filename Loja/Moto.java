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
	public void Printt(){

        System.out.println("Placa: " + placa + "\n"  +
        "Modelo: " + modelo + "\n" +
        "Cor: " + cor +  "\n" + "Marca: " + marca + "\n" +
        "Ano: " + ano + "\n");
    }
	public static void main(String[] args) {
		Moto M1 = new Moto("VVC1976", "Ninja","Verde", "Kawasaki", 2018);
		Moto M2 = new Moto("FTF2391", "Pop100", "Vermelha", "Honda", 2005);
		Moto M3 = new Moto("JWE4506", "Fazer","Preta", "Yamaha", 2013);
		
		M1.Printt();
		M2.Printt();
		M3.Printt();
		
}
}
	
