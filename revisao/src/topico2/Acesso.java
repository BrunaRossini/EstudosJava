package topico2;

import java.time.LocalDateTime;

public class Acesso {
	
	private LocalDateTime login;
	private LocalDateTime logout;
	private Pessoa pessoa; // pessoa a qual o acesso esta vinculado
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Acesso(Pessoa pessoa, LocalDateTime login) {
		this.pessoa = pessoa;
		this.login = login;
	}
	
	public Acesso(LocalDateTime login, LocalDateTime logout) {
		this.login = login;
	}

	public LocalDateTime getLogin() {
		return login;
	}

	public void setLogin(LocalDateTime login) {
		this.login = login;
	}

	public LocalDateTime getLogout() {
		return logout;
	}

	public void setLogout(LocalDateTime logout) {
		this.logout = logout;
	}
	
	

}
