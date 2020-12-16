package topico2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new PessoaFisica("Bruna Rossini","+55 11 2222-2222",1000.0,"bruna","123",45678912208l,
				"+55 11 2222-2222",LocalDate.of(1994,04,22),"Brasileira",true, 200, true, true);
		
		
		System.out.println("\n Nome: " + p.nome + "\n Naturalidade: "+ ((PessoaFisica)p).getNaturalidade() + "\n Nascimento: " + ((PessoaFisica)p).getNascimento());

	}

}
