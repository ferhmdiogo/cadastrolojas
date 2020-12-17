package com.cadastrolojas.apicadastrolojas.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TB_CADASTRO")
public class Cadastro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
	private String codigo_loja;
	
	private BigDecimal faixa_inicio;
	
	private BigDecimal faixa_fim;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigo_loja() {
		return codigo_loja;
	}

	public void setCodigo_loja(String codigo_loja) {
		this.codigo_loja = codigo_loja;
	}

	public BigDecimal getFaixa_inicio() {
		return faixa_inicio;
	}

	public void setFaixa_inicio(BigDecimal faixa_inicio) {
		this.faixa_inicio = faixa_inicio;
	}

	public BigDecimal getFaixa_fim() {
		return faixa_fim;
	}

	public void setFaixa_fim(BigDecimal faixa_fim) {
		this.faixa_fim = faixa_fim;
	}

}
