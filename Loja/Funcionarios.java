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
		

		public static void main(String[] args) {
			Funcionarios F1 = new Funcionarios("Fernando", 40028922, "vendas", "SP");
			Funcionarios F2 = new Funcionarios("Gloria", 69687777, "vendas", "RJ");
			System.out.println(F1);
			System.out.println(F2);
					}

}
