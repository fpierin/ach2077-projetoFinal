package br.usp.each.ach2077.modelo.repositorio;

import java.util.List;

import br.usp.each.ach2077.representacoes.Loja;

public interface RepositorioDeLojas {

	List<Loja> obterLojasEmOrdemAlfabetica();

	List<Loja> obterLojasEmOrdemDeCategoria();

}
