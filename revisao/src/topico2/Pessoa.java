package topico2;

import java.time.LocalDate;
import java.util.Collection;
import java.util.ArrayList;


public abstract class Pessoa implements Cliente, Fornecedor, Usuario{

	protected String nome;
	protected String telefoneFixo;
	protected double rendaBruta;
	protected String login;
	protected String senha;
	protected Collection<Acesso> acessos;
	protected Collection<Endereco> enderecos;
	
	
	

	public Pessoa(String nome, String telefoneFixo, double rendaBruta, String login, String senha) {
          this.nome = nome;
          this.telefoneFixo = telefoneFixo;
          this.rendaBruta = rendaBruta;
          this.login = login;
          this.senha = senha;
          this.acessos = new ArrayList<Acesso>();
          this.enderecos = new ArrayList<Endereco>();
	}

	 public Collection<Acesso> getAcesso(){
		 return this.acessos;
	 }
	 
	 public Collection<Endereco> getEnderecos(){
		 return this.enderecos;
	 }
	
	public String obterPedidosDoPeriodo(LocalDate inicio, LocalDate fim) {
		String relatorioPedidos = "";
		
		// lógica para recuperar os pedidos do periodo especificado.
		return relatorioPedidos;
	}
	public String emitirFaturaDoPeriodo(LocalDate inicio, LocalDate fim)
	{
		String relatorioFatura = "";
		// lógica para emitir fatura do periodo especificado.
		return relatorioFatura;
	}
	public String obterUltimoAcesso() {
		String dadosUltimoAcesso = "";
		// lógica para recuperar os dados do ultimo acesso da pessoa ao sistema.
		return dadosUltimoAcesso;
	}
	public String obterHistoricoAcessos() {
		String dadosHistoricoAcesso = "";
		// lógica para recuperar os dados do Historico acesso da pessoa ao sistema
		return dadosHistoricoAcesso;
	}
	
	/* Como Pessoa é uma classe abstrata seria possível criar os métodos de forma abstrata
	   e deixar o corpo do método para ser criado nas classes concretas. 
	 */
	
	
	
	
	
}