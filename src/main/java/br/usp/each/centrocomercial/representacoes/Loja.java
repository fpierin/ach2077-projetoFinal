package br.usp.each.centrocomercial.representacoes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Loja {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String nome;

    @Column
    private String url;

    @Column
    private String descricao;

    @ManyToOne(targetEntity = Categoria.class, fetch = FetchType.EAGER)
    private Categoria categoria;

    public Loja() {
    }

    public Loja(final int id, final String nome, final String url,
	    final String descricao, final Categoria categoria) {
	super();
	this.id = id;
	this.nome = nome;
	this.url = url;
	this.descricao = descricao;
	this.categoria = categoria;
    }

    public Categoria getCategoria() {
	return categoria;
    }

    public String getDescricao() {
	return descricao;
    }

    public int getId() {
	return id;
    }

    public String getNome() {
	return nome;
    }

    public String getUrl() {
	return url;
    }

    public void setCategoria(final Categoria categoria) {
	this.categoria = categoria;
    }

    public void setDescricao(final String descricao) {
	this.descricao = descricao;
    }

    public void setId(final int id) {
	this.id = id;
    }

    public void setNome(final String nome) {
	this.nome = nome;
    }

    public void setUrl(final String url) {
	this.url = url;
    }

    @Override
    public String toString() {
	return "Loja [id=" + id + ", nome=" + nome + "]";
    }

}
