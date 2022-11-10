package br.com.flaviocardoso.modelo.desconto;

import java.math.BigDecimal;

import br.com.flaviocardoso.modelo.orcamento.Orcamento;

public class CalculadoraDeDesconto {
	public BigDecimal calcular(Orcamento orcamento, Desconto desconto) {
		 return new DescontoParaOrcamentoComMaisDeCincoItens(
				 new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
					new SemDesconto())).calcular(orcamento);
		
	}
}
