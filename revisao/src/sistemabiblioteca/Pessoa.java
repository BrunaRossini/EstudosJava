package sistemabiblioteca;

import java.util.Date;

public abstract class Pessoa {

	private Date nascimento = new Date();
	private long cpf;
	private String email;
	private String login;
	private String nome;
	private String senha;
	private String sobrenome;

public Pessoa(Date nascimento, long cpf, String email, String login, String nome, String senha, String sobrenome) {
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.email = email;
		this.login = login;
		this.nome = nome;
		this.senha = senha;
		this.sobrenome = sobrenome;
	}

public Date getNascimento() {
	return nascimento;
}

public void setNascimento(Date nascimento) {
	this.nascimento = nascimento;
}

public long getCpf() {
	return cpf;
}

public void setCpf(long cpf) {
	this.cpf = cpf;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public String getSobrenome() {
	return sobrenome;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}




}
