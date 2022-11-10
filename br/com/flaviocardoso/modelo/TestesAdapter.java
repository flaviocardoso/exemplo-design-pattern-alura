package br.com.flaviocardoso.modelo;

import java.math.BigDecimal;

import br.com.flaviocardoso.modelo.http.JavaHttpClient;
import br.com.flaviocardoso.modelo.orcamento.ItemOrcamento;
import br.com.flaviocardoso.modelo.orcamento.Orcamento;
import br.com.flaviocardoso.modelo.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		registro.registrat(orcamento);
	}

}
