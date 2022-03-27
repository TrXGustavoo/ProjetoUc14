package br.com.VendasCelulares.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Celular {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	private String descricao;

	private Double valor;

	private Boolean usado;

	private LocalDateTime dataCadastro = LocalDateTime.now();

	public Celular() {
		super();
	}

	public Celular(String nome, String descricao, Double valor, Boolean usado) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.usado = usado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Boolean getUsado() {
		return usado;
	}

	public void setUsado(Boolean usado) {
		this.usado = usado;
	}

	public Integer getId() {
		return id;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public static Iterable<Celular> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
