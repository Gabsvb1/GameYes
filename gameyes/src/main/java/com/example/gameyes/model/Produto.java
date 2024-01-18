package com.example.gameyes.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório")
	@Size(min =3, max =100, message = "O atributo nome deve conter no minimo 3 e no maximo 100 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo genêro é obrigatório")
	@Size(min =3, max =100, message = "O atributo nome deve conter no minimo 3 e no maximo 100 caracteres")
	private String genero;
	
	@NotBlank(message="o atributo preço é obrigatório")
	@Size(min=1, max=100, message = "O atributo nome deve conter no minimo 3 e no maximo 100 caracteres")
	private String preco; 
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	@NotBlank(message = "O atributo nota é obrigatório")
	@Size(min =1, max =100, message = "O atributo nome deve conter no minimo 1 e no maximo 100 caracteres")
	private String nota;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}
	
	
	
	
	
	
	
	
}
