package br.usp.each.centrocomercial.repositorios;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.IOUtils;

import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class Imagens {

    private final File pastaImagens;

    public Imagens(final ServletContext context) {
	final String caminhoImagens = context.getRealPath("/WEB-INF/imagens");
	pastaImagens = new File(caminhoImagens);
	pastaImagens.mkdir();
    }

    public File mostra(final String imagem) {
	return new File(pastaImagens, imagem + ".jpg");
    }

    public void salva(final UploadedFile imagem, final String nomeDaImagem) {
	final File destino = new File(pastaImagens, nomeDaImagem + ".jpg");
	try {
	    IOUtils.copyLarge(imagem.getFile(), new FileOutputStream(destino));
	} catch (final IOException e) {
	    throw new RuntimeException("Erro ao copiar imagem", e);
	}

    }

}
