package Loja;

public class Funcionarios {
		private String nome;
		private int numero;
		private String setor;
		private String estado;
		
		public Funcionarios(String nome, int numero,String setor,String estado) {
			this.nome=nome;
			this.numero=numero;
			this.setor=setor;
			this.estado=estado;
		}
		public void Printt(){

	        System.out.println("Nome: " + nome + "\n" +
	        "Numero: " + numero + "\n" +
	        "Setor: " + setor  + "\n" +
	        "Estado: " + estado + "\n");
	    }

		public static void main(String[] args) {
			Funcionarios F1 = new Funcionarios("Fernando", 40028922, "vendas", "SP");
			Funcionarios F2 = new Funcionarios("Gloria", 69687777, "vendas", "RJ");
			Funcionarios F3 = new Funcionarios("Eduardo", 88877668, "recepcao", "SP");
			Funcionarios F4 = new Funcionarios("Luisa", 98989898, "recepcao", "RJ");
			
			F1.Printt();
			F2.Printt();
			F3.Printt();
			F4.Printt();
					}

}
