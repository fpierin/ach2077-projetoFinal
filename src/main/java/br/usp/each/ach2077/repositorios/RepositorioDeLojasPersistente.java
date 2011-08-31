package br.usp.each.ach2077.repositorios;
import java.util.List;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.usp.each.ach2077.modelo.repositorio.RepositorioDeLojas;
import br.usp.each.ach2077.representacoes.Loja;

@Component
public class RepositorioDeLojasPersistente implements RepositorioDeLojas {
	
	private final Session session;

	public RepositorioDeLojasPersistente(final Session session) {
		this.session = session;
	}	

	@SuppressWarnings("unchecked")
	@Override
	public List<Loja> obterLojasEmOrdemAlfabetica() {
		return (List<Loja>) session.createQuery("from Loja order by nome")
								   .list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Loja> obterLojasEmOrdemDeCategoria() {
		return (List<Loja>) session.createQuery("from Loja order by nome")
								   .list();
	}
	
}
