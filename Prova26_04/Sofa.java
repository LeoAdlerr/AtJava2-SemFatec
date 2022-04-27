package sofa;

public class Sofa {
	
	private String nome;
	private int lugares;
	private double tamanho;
	private String cor;
	
	public Sofa(String nome, int lugares, double tam, String cor) {
		this.nome = nome;
		this.lugares = lugares;
		tamanho = tam;
		this.cor = cor;
	}

	public int getLugares() {
		return lugares;
	}


	public void setLugares(int lugares) {
		this.lugares = lugares;
	}


	public double getTamanho() {
		return tamanho;
	}


	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public boolean comprar() {
		System.out.println("Comprando S2");
		return true;
	}
	
	public void PrintAll(){

        System.out.println("\n" + "Nome: " + nome +
        		"\n" + "Lugares: " + lugares + "\n" + "Tamanho: " + tamanho + "\n" +
        "Cor: " + cor);
    }


	public static void main(String[] args){
		
		Sofa S1 = new Sofa("S1", 4, 2.5, "cinza");
		Sofa S2 = new Sofa("S2", 4, 2.3, "beje");
		Sofa S3 = new Sofa("S3", 4, 2.52, "marrom");
		Sofa S4 = new Sofa("S4", 2, 1.8, "cinza");
		
		S1.PrintAll();
		S2.PrintAll();
		S3.PrintAll();
		S4.PrintAll();
		
		S1.comprar();
	}
	
	
}
