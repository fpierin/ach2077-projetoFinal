package br.usp.each.centrocomercial.modelo.repositorio;

import java.util.List;

import br.usp.each.centrocomercial.representacoes.Loja;

public interface RepositorioDeLojas {

    void adiciona(Loja loja);

    Loja busca(int id);

    List<Loja> busca(String nome);

    List<Loja> lista();

    List<Loja> listaPorAtividade(int id);

}
