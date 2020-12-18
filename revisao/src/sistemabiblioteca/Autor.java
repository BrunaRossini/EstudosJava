package sistemabiblioteca;

import java.util.Date;

public class Autor extends Pessoa {
	
	private String nomeCitacoes;
	private String orcid;
	
	public Autor(Date nascimento, long cpf, String email, String login, String nome, String senha, String sobrenome, String nomeCitacoes, String orcid) {
		super(nascimento,cpf,email,login,nome,senha,sobrenome);
		this.nomeCitacoes = nomeCitacoes;
		this.orcid = orcid;
	}

	public String getNomeCitacoes() {
		return nomeCitacoes;
	}

	public void setNomeCitacoes(String nomeCitacoes) {
		this.nomeCitacoes = nomeCitacoes;
	}

	public String getOrcid() {
		return orcid;
	}

	public void setOrcid(String orcid) {
		this.orcid = orcid;
	}
	
	
}
