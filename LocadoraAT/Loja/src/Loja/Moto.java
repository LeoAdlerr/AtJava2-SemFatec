package Loja;

public class Moto {
	private String placa;
	private String modelo;
	private float preco;
	
	public Moto(String placa,String modelo,float preco) {
		this.placa=placa;
		this.modelo=modelo;
		this.preco=preco;	
	}

	public String getPlacaMoto() {
		return placa;
	}

	public void setPlacaMoto(String placa) {
		this.placa = placa;
	}

	public String getModeloMoto() {
		return modelo;
	}

	public void setModeloMoto(String modelo) {
		this.modelo = modelo;
	}

	public float getPrecoMoto() {
		return preco;
	}

	public void setPrecoMoto(float preco) {
		this.preco = preco;
	}
	
}
	
