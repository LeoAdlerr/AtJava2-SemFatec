package Loja;



public class Carro {
        //Assim se faz um comentário!
	/*
	 * Assim se comenta em bloco
	 */
	
	/**
	 * Comentário de documentação
	 * @param args
	 */
	
	// atributos de classe -> características
	private String placa;
	private double potencia;
	private String modelo;
	private String cor;
	private String marca;
	private boolean cambio_automatico;
	private int ano;
	private float preco;
	
	//método construtor executado apenas no ato da instanciação
	
	public Carro(String plac,double pot,String modelo,String cor,String marca,boolean cambio_automatico,int ano) {
		placa=plac;
		potencia=pot;
		this.modelo=modelo; //this necessário quando nomes iguais de atributo e argumento
		this.cor=cor;
		this.cambio_automatico=cambio_automatico;
		this.ano=ano;
		this.marca=marca;
		
	}
	
	//métodos de acesso aos atributos
	public float get_preco() {
		return preco;
	}
	public void  set_preco(float novopreco) {
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
	public void Printt(){

        System.out.println("\n" + "Placa: " + placa + "\n" + "Potência: " + potencia + "\n" +
        "Modelo: " + modelo + "\n" +
        "Cor: " + cor + "\n"  + "Marca: " +marca + "\n" +
        "Com Cambio Automatico: " + cambio_automatico + "\n" +
        "Ano: " + ano + "\n");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando objetos da classe
		Carro C1 = new Carro("FDG6980",2.0, "F8 Spider", "vermelha", "Ferrari",true, 2020);
		//String plac,double pot,String modelo,String cor,String marca,boolean cambio_automatico,int ano
		//declarar na ordem ácima
		
		//declarei e depois instanciei o objeto
		Carro C2;
		C2 =new Carro("USA2000",1.0,"Palio","preto","Fiat",false, 2012);
		
		//usando objetos
		//C1.ano=2020;
		//C1.cor="vermelho";
		C1.andar();
		
		//C2.marca="Ferrari";
		C2.correr(300);
		System.out.println(C2.frear());
		
		C1.Printt();
		C2.Printt();
	}

}
