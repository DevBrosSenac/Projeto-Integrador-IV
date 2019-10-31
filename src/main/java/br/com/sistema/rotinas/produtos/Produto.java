package br.com.sistema.rotinas.produtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import br.com.sistema.enuns.TipoPlataformaProduto;

@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = -4627023780267375102L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Column(name = "descricao", nullable = false, length = 300)
	private String descricao;

	@Column(name = "codigoDeBarras", nullable = false, length = 300)
	private String codigoDeBarras;

	@Column(name = "preco", nullable = false, length = 300)
	private double preco;
	
	@Enumerated
	@Column(name = "plataforma", nullable = false)
	private TipoPlataformaProduto plataforma;

	@OneToMany(fetch = FetchType.LAZY, orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	@JoinColumn(name = "produto_id", nullable = true)
	private List<PerguntasERespostas> perguntasERespostas;
	
	public boolean equals(Object o) {
		if (o instanceof Produto)
			return this.getId() == ((Produto) o).getId();
		else
			return false;
	}

	public TipoPlataformaProduto getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(TipoPlataformaProduto plataforma) {
		this.plataforma = plataforma;
	}

	public Produto() {
		this.perguntasERespostas = new ArrayList<>();
	}
	
	public Produto(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<PerguntasERespostas> getPerguntasERespostas() {
		return perguntasERespostas;
	}

	public void setPerguntasERespostas(List<PerguntasERespostas> perguntasERespostas) {
		this.perguntasERespostas = perguntasERespostas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
