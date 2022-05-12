package Loja;

import java.util.List;

public class Carro {
        //Assim se faz um coment�rio!
	/*
	 * Assim se comenta em bloco
	 */
	
	/**
	 * Coment�rio de documenta��o
	 * @param args
	 */
	
	// atributos de classe -> caracter��ticas
	private String placa;
	private String modelo;
	private float preco;
	
	//m�todo construtor executado apenas no ato da instancia��o
	
	public Carro(String placa,String modelo,float preco) {
		this.placa=placa;
		this.modelo=modelo; //this necess�rio quando nomes iguais de atributo e argumento
		this.preco=preco;
	}
	
	//m�todos de acesso aos atributos
	public float getPrecoCarro() {
		return preco;
	}
	public void  setPrecoCarro(float novopreco) {
		preco=novopreco;
	}
	//m�todos -> a��es
	
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
