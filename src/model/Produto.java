package model;

import util.CategoriaDeProduto;

public class Produto {

	private String nome;
	private double preço;
	private boolean estaEmPromoçao = false;
	private CategoriaDeProduto tipo;
	
	public Produto(String nome, double preço, CategoriaDeProduto tipo) {
		this.nome = nome;
		this.preço = preço;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		if(preço < this.preço){
			estaEmPromoçao = true;
		}
		this.preço = preço;
	}

	public CategoriaDeProduto getTipo() {
		return tipo;
	}
	
	public void setTipo(CategoriaDeProduto tipo) {
		this.tipo = tipo;
	}
	
	public boolean estaEmPromoçao(){
		return estaEmPromoçao;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preço=" + preço + ", tipo=" + tipo
				+ "]";
	}

}