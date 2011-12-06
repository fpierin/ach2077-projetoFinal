package br.usp.each.centrocomercial.representacoes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categoria {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String nome;

    public Categoria() {
    }

    public Categoria(final int id, final String nome) {
	this.id = id;
	this.nome = nome;
    }

    public int getId() {
	return this.id;
    }

    public String getNome() {
	return this.nome;
    }

    public void setId(final int id) {
	this.id = id;
    }

    public void setNome(final String nome) {
	this.nome = nome;
    }

}
