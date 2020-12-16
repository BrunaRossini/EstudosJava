package topico2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new PessoaFisica("Bruna Rossini","+55 11 2222-2222",1000.0,"bruna","123",45678912208l,
				"+55 11 2222-2222",LocalDate.of(1994,04,22),"Brasileira",true, 200, true, true);
		
Pessoa pj = new PessoaJuridica("ivania Lilia","+55 11 2222-2222",500.000,"vania","1234",1161616000123l,"Mundo do Sabor");
		
		System.out.println("\n Nome: " + p.nome + "\n Naturalidade: "+ ((PessoaFisica)p).getNaturalidade() + "\n Nascimento: " + ((PessoaFisica)p).getNascimento());
		System.out.println("\n Nome:" + pj.nome + "\n NomeFantasia: " + ((PessoaJuridica)pj).getNomeFantasia());	
		

	}

}
