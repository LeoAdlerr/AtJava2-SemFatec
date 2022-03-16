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
			Funcionarios F3 = new Funcionarios("Eduardo", 88888888, "recepcao", "SP");
			Funcionarios F4 = new Funcionarios("Luisa", 98989898, "recepcao", "RJ");
			
			System.out.println("F1= "+F1.nome+","+F1.numero+","+F1.setor+","+F1.estado);
			System.out.println("F2= "+F2.nome+","+F2.numero+","+F2.setor+","+F2.estado);
			System.out.println("F3= "+F3.nome+","+F3.numero+","+F3.setor+","+F3.estado);
			System.out.println("F4= "+F4.nome+","+F4.numero+","+F4.setor+","+F4.estado);
					}

}
