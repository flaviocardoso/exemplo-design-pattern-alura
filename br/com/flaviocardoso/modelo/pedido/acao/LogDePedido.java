package br.com.flaviocardoso.modelo.pedido.acao;

import br.com.flaviocardoso.modelo.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedifo foi gerado: " + pedido);
	}

}
