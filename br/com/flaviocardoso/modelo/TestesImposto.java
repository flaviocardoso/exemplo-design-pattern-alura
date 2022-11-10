package br.com.flaviocardoso.modelo;

import java.math.BigDecimal;

import br.com.flaviocardoso.modelo.imposto.CalculadoraDeImpostos;
import br.com.flaviocardoso.modelo.imposto.ICMS;
import br.com.flaviocardoso.modelo.imposto.ISS;
import br.com.flaviocardoso.modelo.orcamento.ItemOrcamento;
import br.com.flaviocardoso.modelo.orcamento.Orcamento;

public class TestesImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
	}

}
