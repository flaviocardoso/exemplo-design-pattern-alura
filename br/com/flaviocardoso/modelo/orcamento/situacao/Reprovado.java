package br.com.flaviocardoso.modelo.orcamento.situacao;

import br.com.flaviocardoso.modelo.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
