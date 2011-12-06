package br.usp.each.centrocomercial.recursos;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.usp.each.centrocomercial.modelo.repositorio.RepositorioDeCategorias;
import br.usp.each.centrocomercial.modelo.repositorio.RepositorioDeLojas;
import br.usp.each.centrocomercial.representacoes.Categoria;
import br.usp.each.centrocomercial.representacoes.Loja;

@Resource
public class LojasController {

    private final RepositorioDeLojas repositorioDeLojas;
    private final Result result;
    private final RepositorioDeCategorias repositorioDeCategorias;

    public LojasController(final Result result,
	    final RepositorioDeCategorias repositorioDeCategorias,
	    final RepositorioDeLojas repositorioDeLojas) {
	this.result = result;
	this.repositorioDeLojas = repositorioDeLojas;
	this.repositorioDeCategorias = repositorioDeCategorias;
    }

    @Post
    public void adiciona(final Loja loja) {
	repositorioDeLojas.adiciona(loja);
    }

    public List<Loja> busca(final String nome) {
	result.include("nome", nome);
	return repositorioDeLojas.busca(nome);
    }

    @Get
    @Path("/produtos/busca.json")
    public void buscaJson(final String q) {
	result.use(Results.json()).withoutRoot()
		.from(repositorioDeLojas.busca(q)).exclude("id").serialize();
    }

    @Path("/")
    public void index() {

	final List<Loja> lojas = repositorioDeLojas.lista();

	final List<Categoria> categorias = repositorioDeCategorias.lista();

	result.include("lojas", lojas);
	result.include("categorias", categorias);

    }

    @Path("/localizacao")
    public void localizacao() {

    }

    @Path("/lojas/atividade/{id}")
    public List<Loja> lojasPorAtividade(final int id) {
	return repositorioDeLojas.listaPorAtividade(id);
    }

    @Path("/lojas/{id}")
    public Loja mostra(final int id) {
	return repositorioDeLojas.busca(id);
    }

    public void novo() {
    }

}
