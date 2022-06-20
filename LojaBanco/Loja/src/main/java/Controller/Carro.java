package Controller;

import java.util.List;

public class Carro {
        //Assim se faz um comentário!
	/*
	 * Assim se comenta em bloco
	 */
	
	/**
	 * Comentário de documentação
	 * @param args
	 */
	
	// atributos de classe -> caracterú�ticas
	private String placa;
	private String modelo;
	private float preco;
	
	//método construtor executado apenas no ato da instanciação
	
	public Carro(String placa,String modelo,float preco) {
		this.placa=placa;
		this.modelo=modelo; //this necessário quando nomes iguais de atributo e argumento
		this.preco=preco;
	}
	
	//métodos de acesso aos atributos
	public float getPrecoCarro() {
		return preco;
	}
	public void  setPrecoCarro(float novopreco) {
		preco=novopreco;
	}
	//métodos -> ações
	
	public void andar() {
		System.out.println("andando");
		
	}
	public boolean frear() {
		System.out.println("freando");
		return true;
	}
	public void correr(int velocidade) {
		System.out.println("Estou correndo "+velocidade);
	}

	public String getModeloCarro() {
		return modelo;
	}

	public void setModeloCarro(String modelo) {
		this.modelo = modelo;
	}

	public String getPlacaCarro() {
		return placa;
	}

	public void setPlacaCarro(String placa) {
		this.placa = placa;
	}
}
