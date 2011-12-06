package br.usp.each.centrocomercial.repositorios;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.usp.each.centrocomercial.modelo.repositorio.RepositorioDeLojas;
import br.usp.each.centrocomercial.representacoes.Loja;

@Component
public class RepositorioDeLojasPersistente implements RepositorioDeLojas {

    private final Session session;

    public RepositorioDeLojasPersistente(final Session session) {
	this.session = session;
    }

    @Override
    public void adiciona(final Loja loja) {
	session.save(loja);
    }

    @Override
    public Loja busca(final int id) {
	return (Loja) session.createQuery("from Loja where id = :id")
		.setInteger("id", id).uniqueResult();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Loja> busca(final String nome) {
	return session.createCriteria(Loja.class)
		.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE))
		.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Loja> lista() {
	return session.createQuery("from Loja order by nome").list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Loja> listaPorAtividade(final int id) {
	return session.createQuery("from Loja where atividade.id = :id")
		.setInteger("id", id).list();
    }

}
