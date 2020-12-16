package topico2;

import java.time.LocalDate;

//Definir o nome da interface
interface Cliente {
	
	/*Criar a assinatura dos métodos,
	toda classe que implementar a interface precisa seguir a assinatura*/	
	public String obterPedidosDoPeriodo(LocalDate inicio, LocalDate fim);

}
