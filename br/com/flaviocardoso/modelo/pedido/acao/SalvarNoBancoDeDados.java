package br.com.flaviocardoso.modelo.pedido.acao;

import br.com.flaviocardoso.modelo.pedido.Pedido;

public class SalvarNoBancoDeDados implements AcaoAposGerarPedido {
	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando Pedido no Banco de dados!");
	}
}
