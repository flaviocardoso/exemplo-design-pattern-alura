package br.com.flaviocardoso.modelo.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.flaviocardoso.modelo.DomainException;
import br.com.flaviocardoso.modelo.orcamento.ItemOrcamento;
import br.com.flaviocardoso.modelo.orcamento.Orcamento;
import br.com.flaviocardoso.modelo.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;

	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void executar(GeraPedido dados) { // 
		int itens = dados.getQuantidadeItens();
		if (itens <= 0) {
			throw new DomainException("Não é permitido número negativos!");
		}
		
		Orcamento orcamento = new Orcamento();
		for (int i = 0; i < itens; i++) {
			orcamento.adicionarItem(new ItemOrcamento(dados.getValorOrcamento()));	
		}
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(acao -> acao.executarAcao(pedido));
	}
}
