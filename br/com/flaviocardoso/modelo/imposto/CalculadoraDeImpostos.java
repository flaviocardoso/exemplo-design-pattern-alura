package br.com.flaviocardoso.modelo.imposto;

import java.math.BigDecimal;

import br.com.flaviocardoso.modelo.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
