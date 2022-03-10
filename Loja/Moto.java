package Loja;
public class Moto {
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

public Moto(String plac,double pot,String modelo,String cor,String marca,boolean cambio_automatico,int ano) {
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
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	//instanciando objetos da classe
	Moto M1 = new Moto("BRR6969",2.0, "ninja", "verde", "kawasaki",true, 2018);
	System.out.println(M1.cor+"\n"+M1.marca);
	//String plac,double pot,String modelo,String cor,String marca,boolean cambio_automatico,int ano
	//declarar na ordem ácima
	
	//declarei e depois instanciei o objeto
	Moto M2;
	
	Moto M3;
	
	M2 =new Moto("ABC7676",1.0,"pop100","cinza","pop",false, 2004);
	System.out.println(M2.cor+"\n"+M2.marca);
	
	M3 =new Moto("ZYW9876",1.0, "yamaha", "branca", "yamaha",true, 2019);
	//System.in.preco;
	System.out.println(M3.cor+"\n"+M3.marca);

}

}
