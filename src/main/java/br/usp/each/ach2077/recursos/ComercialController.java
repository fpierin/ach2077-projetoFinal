package br.usp.each.ach2077.recursos;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.usp.each.ach2077.modelo.repositorio.RepositorioDeLojas;
import br.usp.each.ach2077.representacoes.Loja;

@Resource
@Path("/comercial")
public class ComercialController {
	
	private final RepositorioDeLojas repositorioDeLojas;
	private final Result result;

	public ComercialController(final Result result, final RepositorioDeLojas repositorioDeLojas) {
		this.result = result;
		this.repositorioDeLojas = repositorioDeLojas;
	}
	
	@Path("/")
	public void index(){
		final List<Loja> lojasEmOrdemAlfabetica = repositorioDeLojas.obterLojasEmOrdemAlfabetica();
		final List<Loja> lojasEmOrdemDeCategoria = repositorioDeLojas.obterLojasEmOrdemDeCategoria();
		result.include("lojasEmOrdemAlfabetica", lojasEmOrdemAlfabetica);
		result.include("lojasPorRamoDeAtividade", lojasEmOrdemDeCategoria); 		
	}
	
}
