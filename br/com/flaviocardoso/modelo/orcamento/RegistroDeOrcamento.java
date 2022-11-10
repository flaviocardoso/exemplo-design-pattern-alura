package br.com.flaviocardoso.modelo.orcamento;

import java.util.Map;

import br.com.flaviocardoso.modelo.DomainException;
import br.com.flaviocardoso.modelo.http.HttpAdapter;

public class RegistroDeOrcamento {
	private HttpAdapter http;
	
	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrat(Orcamento orcamento) {
		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento nao finalizao");
		}
		
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQuantidadeItens()
				);
		
		http.post(url, dados );
	}
}
