package pessoasArrays;

public class Pessoa {
	
	private String nome;
	private String email;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String checkItems(String nome) {
	    
		if (nome.length() < 3)
			nome = "Invalido. Nome muito pequeno";
		
		else
			nome = nome;
		return nome;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(checkItems(nome));
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
	

}
