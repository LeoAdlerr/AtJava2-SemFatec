package Loja;

public class Van {
	private String placa;
	private String modelo;
	private float preco;
	
	public Van(String placa,String modelo,float preco) {
		this.placa=placa;
		this.modelo=modelo;
		this.preco=preco;		
	}

	public String getPlacaVan() {
		return placa;
	}

	public void setPlacaVan(String placa) {
		this.placa = placa;
	}

	public String getModeloVan() {
		return modelo;
	}

	public void setModeloVan(String modelo) {
		this.modelo = modelo;
	}


	public void setPrecoVan(float preco) {
		this.preco = preco;
	}


	public String getPrecoVan() {
		// TODO Auto-generated method stub
		return null;
	}

}
	
