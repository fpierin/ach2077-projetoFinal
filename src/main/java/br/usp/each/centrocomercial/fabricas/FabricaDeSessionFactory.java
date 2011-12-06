package br.usp.each.centrocomercial.fabricas;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class FabricaDeSessionFactory {
	
	public SessionFactory build(){
		final AnnotationConfiguration configuration = new AnnotationConfiguration().configure();
		return configuration.buildSessionFactory();		
	}

}