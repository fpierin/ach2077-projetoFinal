package br.usp.each.ach2077.representacoes;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.Entity;

@Entity
public class Loja {
	
	@Id
	@TableGenerator(name = "TabelaGeradoraDeIds", table = "SEQUENCE",
			pkColumnName = "TABELA", valueColumnName = "NEXT_ID",
			pkColumnValue = "LOJA", initialValue = 0, allocationSize = 1)
	private int id;
	
	@Column
	private String nome;

	public Loja(final int id, final String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Loja() {	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}
	
	
}
