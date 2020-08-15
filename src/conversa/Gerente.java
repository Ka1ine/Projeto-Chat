package conversa;

public class Gerente extends Funcionario{
		
		private String formacao;
		
		public String getFormacao() {
			return this.formacao;
		}
	
		public Gerente (String nome, String cpf, String idade, String email, String formacao) {
			super(nome, cpf, idade, email );
			this.formacao = formacao;
		}
		public String ei() {
			return "Cade o relatorio?";	
		}
		public String confusa() {
			return super.oi() + " " + super.ola ();
		}
		public String ei2() {
			return "VAMOS PRA CASA AAAAAAAAAAAA";	
		}
}