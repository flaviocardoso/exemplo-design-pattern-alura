package br.com.flaviocardoso.modelo;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.flaviocardoso.modelo.pedido.GeraPedido;
import br.com.flaviocardoso.modelo.pedido.GeraPedidoHandler;
import br.com.flaviocardoso.modelo.pedido.acao.EnviarEmail;
import br.com.flaviocardoso.modelo.pedido.acao.LogDePedido;
import br.com.flaviocardoso.modelo.pedido.acao.SalvarNoBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "";
		BigDecimal valorOrcamento = new BigDecimal("765.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new EnviarEmail(),
				new SalvarNoBancoDeDados(),
				new LogDePedido()
		));
		
		handler.executar(gerador);
		
	}

}
