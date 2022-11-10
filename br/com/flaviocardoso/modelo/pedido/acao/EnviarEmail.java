package br.com.flaviocardoso.modelo.pedido.acao;

import br.com.flaviocardoso.modelo.pedido.Pedido;

public class EnviarEmail implements AcaoAposGerarPedido{
	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email com dados do pedido!");
	}
}
