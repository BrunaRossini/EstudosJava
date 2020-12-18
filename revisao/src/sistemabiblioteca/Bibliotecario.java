package sistemabiblioteca;

import java.util.Date;

public class Bibliotecario extends Pessoa {
	
	private Date dataAdmissao = new Date();
	private int idFuncionario;
	
	public Bibliotecario(Date nascimento, long cpf, String email, String login, String nome, String senha, String sobrenome, Date dataAdmissao,int idFuncionario) {
		super(nascimento,cpf,email,login,nome,senha,sobrenome);
		this.dataAdmissao = dataAdmissao;
		this.idFuncionario = idFuncionario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	
  
}
