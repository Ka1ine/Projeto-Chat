package conversa;

public class Conversa {

	public static void main(String[] args) {
		
		Pessoa Pedro = new Pessoa("Pedro", "111.222.333-44", "18");
		System.out.println(Pedro.nome+ ": " + Pedro.oi());
		Funcionario Davy  = new Funcionario("Davy", "444.333.444-33", "17","davy@gmail.com");
		System.out.println(Davy.nome + ": " + Davy.ola());
		Gerente Kaline  = new Gerente("Kaline", "222.333.111-55", "17","Kaline@gmail.com", "Engenheira");
		System.out.println(Kaline.nome + ": " + Kaline.ei());
		System.out.println(Davy.nome + ": " + Davy.amigo());
		System.out.println(Kaline.nome + ": " + Kaline.confusa());
		System.out.println(Pedro.nome + ": " + Pedro.oi2());
		System.out.println(Kaline.nome + ": " + Kaline.getEmail());
		System.out.println(Davy.nome + ": " + Davy.ola2());
		System.out.println(Pedro.nome + ": " + Pedro.oi3());
		System.out.println(Kaline.nome + ": " + Kaline.ei2());
		
		
	}

}
