package topico2;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa implements Funcionario {

	private long cpf;
	private String telefoneCelular;
	private LocalDate nascimento;
	private String naturalidade;
	private boolean valeTransporte;
	private double valorValeTransporte;
	private boolean valeAlimentacao;
	private boolean valorValeAlimentacao;

	public PessoaFisica(String nome, String telefoneFixo, double rendaBruta, String login, String senha, long cpf,
			String telefoneCelular, LocalDate nascimento, String naturalidade, boolean valeTransporte,
			double valorValeTransporte, boolean valeAlimentacao, boolean valorValeAlimentacao) {
		super(nome, telefoneFixo, rendaBruta, login, senha); // Chamada ao construtor da superclasse(Pessoa)
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

	/*
	 * super para referenciar que o atributo esta na classe mae Pessoa.
	 *  Utilizar o super � melhor para mais legibilidade ao c�digo, mas poderia ser utilizado
	 * this j� que Pessoa fisica � uma classe filha de Pessoa
	 */

	public double calcularRendaLiquida() {
		if (this.valeTransporte) {
			return super.rendaBruta - ( 0.08 * super.rendaBruta);
					}
		return super.rendaBruta;
	}
}
