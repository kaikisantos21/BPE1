package com.senaidev.cadastroproduto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Produtos {
@Entity
@Table(value = "tb_produto")
public class produto {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.1)
	 private long id;
	  
	  @Column(name = "nome")
	 private String nome;
	 private double preco;
	public produto(long id, String nome, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	 
	 
}

}
