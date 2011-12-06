package br.usp.each.centrocomercial.recursos;

import java.util.List;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.usp.each.centrocomercial.modelo.repositorio.RepositorioDeCategorias;
import br.usp.each.centrocomercial.representacoes.Categoria;

@Component
public class RepositorioDeCategoriasPersistente implements
	RepositorioDeCategorias {

    private final Session session;

    public RepositorioDeCategoriasPersistente(final Session session) {
	this.session = session;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Categoria> lista() {
	return session.createCriteria(Categoria.class).list();
    }

}
