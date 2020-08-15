package conversa;

public class Pessoa {
	
	public String nome;
	private String cpf;
	private String idade;
	
	public String getNome() {
		return this.nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public String getIdade() {
		return this.idade;
	}
	
	public Pessoa(String nome, String cpf, String idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	public String oi() {
		return "E ae, Blz?";	
	}
	public String oi2() {
		return "Me passa seu email para colocar no relatorio";	
	}
	public String oi3() {
		return "AAAAAAAAAAAAAAA EU QUERO IR PRA CASA";	
	}
	
}	

