package br.usp.each.ach2077.recursos;

import java.util.Arrays;
import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.usp.each.ach2077.modelo.repositorio.RepositorioDeLojas;
import br.usp.each.ach2077.representacoes.Loja;

@Resource
@Path("/")
public class ComercialController {
	
	private final Result result;
	private final RepositorioDeLojas repositorioDeLojas;

	public ComercialController(final Result result, final RepositorioDeLojas repositorioDeLojas) {
		this.result = result;
		this.repositorioDeLojas = repositorioDeLojas;
	}
	
	@Path("/")
	public void index(){}
	
	
	@Get
	public List<Loja> lojasEmOrdemAlfabetica(){
		return Arrays.asList(new Loja(1, "teste")); 
//		repositorioDeLojas.obterLojasEmOrdemAlfabetica(); 
	}

	@Get
	public List<Loja> lojasEmOrdemDeCategoria(){
		return repositorioDeLojas.obterLojasEmOrdemDeCategoria(); 
	}	
	
}
