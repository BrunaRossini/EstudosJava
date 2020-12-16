package topico2;

import java.time.LocalDate;

public class PessoaFisica  extends Pessoa {
	
	private long cpf;
	private String telefoneCelular;
	private LocalDate nascimento;
	private String naturalidade;
	private boolean valeTransporte;
	private double valorValeTransporte;
	private boolean valeAlimentacao;
	private boolean valorValeAlimentacao;
	
	
	public PessoaFisica(String nome, String telefoneFixo, double rendaBruta, String login, String senha, long cpf, String telefoneCelular, LocalDate nascimento, String naturalidade,boolean valeTransporte, double valorValeTransporte, boolean valeAlimentacao, boolean valorValeAlimentacao) {
		super(nome, telefoneFixo,rendaBruta, login, senha); // Chamada ao construtor da superclasse(Pessoa)
		this.cpf = cpf;
		this.telefoneCelular = telefoneCelular;
		this.nascimento = nascimento;
		this.naturalidade = naturalidade;
		this.valeTransporte = valeTransporte;
		this.valorValeTransporte = valorValeTransporte;
		this.valeAlimentacao = valeAlimentacao;
		this.valorValeAlimentacao = valorValeAlimentacao;
		
	}


	public long getCpf() {
		return cpf;
	}


	public void setCpf(long cpf) {
		this.cpf = cpf;
	}


	public String getTelefoneCelular() {
		return telefoneCelular;
	}


	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}


	public LocalDate getNascimento() {
		return nascimento;
	}


	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}


	public String getNaturalidade() {
		return naturalidade;
	}


	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}


	public boolean isValeTransporte() {
		return valeTransporte;
	}


	public void setValeTransporte(boolean valeTransporte) {
		this.valeTransporte = valeTransporte;
	}


	public double getValorValeTransporte() {
		return valorValeTransporte;
	}


	public void setValorValeTransporte(double valorValeTransporte) {
		this.valorValeTransporte = valorValeTransporte;
	}


	public boolean isValeAlimentacao() {
		return valeAlimentacao;
	}


	public void setValeAlimentacao(boolean valeAlimentacao) {
		this.valeAlimentacao = valeAlimentacao;
	}


	public boolean isValorValeAlimentacao() {
		return valorValeAlimentacao;
	}


	public void setValorValeAlimentacao(boolean valorValeAlimentacao) {
		this.valorValeAlimentacao = valorValeAlimentacao;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	
	
	

}
