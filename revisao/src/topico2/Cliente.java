package topico2;

import java.time.LocalDate;

//Definir o nome da interface
interface Cliente {
	
	/*Criar a assinatura dos m�todos,
	toda classe que implementar a interface precisa seguir a assinatura*/	
	public String obterPedidosDoPeriodo(LocalDate inicio, LocalDate fim);

}
