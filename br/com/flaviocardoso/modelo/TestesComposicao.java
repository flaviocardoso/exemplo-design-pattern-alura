package br.com.flaviocardoso.modelo;

import java.math.BigDecimal;

import br.com.flaviocardoso.modelo.orcamento.ItemOrcamento;
import br.com.flaviocardoso.modelo.orcamento.Orcamento;
import br.com.flaviocardoso.modelo.orcamento.OrcamentoProxy;

public class TestesComposicao {

	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionarItem(antigo);
		
		OrcamentoProxy proxy = new OrcamentoProxy(novo); // mais performace e segurança
		
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
	}

}
