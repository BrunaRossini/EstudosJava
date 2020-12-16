package topico2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {

		Pessoa p = new PessoaFisica("Bruna Rossini", "+55 11 2222-2222", 1000.0, "bruna", "123", 45678912208l,
				"+55 11 2222-2222", LocalDate.of(1994, 04, 22), "Brasileira", true, 200, true, true);

		Pessoa pj = new PessoaJuridica("ivania Lilia", "+55 11 2222-2222", 500.000, "vania", "1234", 79132858000160l,
				"Mundo do Sabor");

		System.out.println("\n Nome: " + p.nome + "\n Naturalidade: " + ((PessoaFisica) p).getNaturalidade()
				+ "\n Nascimento: " + ((PessoaFisica) p).getNascimento());
		System.out.println("\n Nome:" + pj.nome + "\n NomeFantasia: " + ((PessoaJuridica) pj).getNomeFantasia());

		Endereco e1 = new Endereco(TipoLogradouro.Avenida, "Padre Estanislau de Campos", 205, "Artur Alvim",
				"São Paulo", "SP", "Brasil", 3590060l, true, pj);
		Endereco e2 = new Endereco(TipoLogradouro.Praça, "Arco Verde", 205, "Artur Alvim", "São Paulo", "SP", "Brasil",
				3590060l, true, pj);

		System.out.println("\n Endereço: " + e1.getTipo() + " " + e1.getLogradouro() + ", " + e1.getNumero());

		System.out.println("\n Renda Bruta de " + p.nome + "\n R$: " + ((PessoaFisica) p).calcularRendaLiquida());

		Acesso a1 = new Acesso(p, LocalDateTime.of(2020, 11, 5, 19, 30));
		a1.setLogout(LocalDateTime.of(2020, 11, 5, 20, 30));
		Acesso a2 = new Acesso(p, LocalDateTime.now());

		p.getAcesso().add(a1);
		p.getAcesso().add(a2);

		for (Acesso a : p.getAcesso()) {
			System.out.println("\n Login: " + a.getLogin() + "\n Logout: " + a.getLogout());
		}

		pj.getEnderecos().add(e1);
		pj.getEnderecos().add(e2);

		for (Endereco a : pj.getEnderecos()) {
			System.out.println("\n Endereço: "+ a.getTipo() + " " + a.getLogradouro() + ", " + a.getNumero());
		}

	}

}
