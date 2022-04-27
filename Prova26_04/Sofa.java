package sofa;

public class Sofa {
	
	private int lugares;
	private double tamanho;
	private String cor;
	
	public Sofa(int lugares, double tam, String cor) {
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
	
	public void Printt(){

        System.out.println("\n" + "Lugares: " + lugares + "\n" + "Tamanho: " + tamanho + "\n" +
        "Cor: ");
    }


	public static void main(String[] args){
		
		Sofa S1 = new Sofa(4, 2.5, "cinza");
		Sofa S2 = new Sofa(4, 2.3, "beje");
		Sofa S3 = new Sofa(4, 2.52, "marrom");
		Sofa S4 = new Sofa(4, 1.8, "cinza");
		
		S1.Printt();
		S2.Printt();
		S3.Printt();
		S4.Printt();
		
	}
	
	
}
