package br.com.intelech.model;

import java.time.LocalDate;

public class Avaliacao {
	private Integer idade;
	private Double peso;
	private Double altura;
	private Double imc;
	private LocalDate dataAvaliacao;
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getImc() {
		return imc;
	}
	public void setImc(Double imc) {
		this.imc = imc;
	}
	public LocalDate getDataAvaliacao() {
		return dataAvaliacao;
	}
	public void setDataAvaliacao(LocalDate dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}
	
	
	
}
