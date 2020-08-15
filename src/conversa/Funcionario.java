package conversa;

public class Funcionario extends Pessoa{
	private String email;
	
	
	public String getEmail() {
		return this.email;
	}
	
	public Funcionario (String nome, String cpf, String idade, String email) {
		super(nome, cpf, idade);
		this.email = email;
	}
	public String ola() {
		return "Bom dia!!!!!";	
	}
	public String amigo() {
		return super.oi();	
	}
	public String ola2() {
		return "Posso ir pra casa?";	
	}
	
}
