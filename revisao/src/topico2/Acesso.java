package topico2;

import java.time.LocalDateTime;

public class Acesso {
	
	private LocalDateTime login;
	private LocalDateTime logout;
	
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
