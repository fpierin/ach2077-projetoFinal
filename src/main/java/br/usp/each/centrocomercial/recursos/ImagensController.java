package br.usp.each.centrocomercial.recursos;

import java.io.File;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.usp.each.centrocomercial.repositorios.Imagens;
import br.usp.each.centrocomercial.representacoes.Loja;

@Resource
public class ImagensController {

    private final Imagens imagens;

    public ImagensController(final Validator validator, final Imagens imagens,
	    final Result result) {
	this.imagens = imagens;
    }

    @Get
    @Path("/lojas/{loja.id}/logo")
    public File logo(final Loja loja) {
	final String logo = "logo" + loja.getId();
	return imagens.mostra(logo);
    }

    @Get
    @Path("/lojas/{loja.id}/mapa")
    public File mapa(final Loja loja) {
	final String mapa = "mapa" + loja.getId();
	return imagens.mostra(mapa);
    }

}
