package model;

import java.util.*;

public class ListaDeProdutos{

	private List<Produto> listaDeProdutos;
	private double preço;
	private String nome;
	
	public ListaDeProdutos(String nome){
		this.nome = nome;
		listaDeProdutos = new ArrayList<Produto>();
		preço = 0;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void adicionaProduto(Produto produto){
		setPreço(this.preço + produto.getPreço());
		listaDeProdutos.add(produto);
	}
	
	public void removeProduto(Produto produto){
		setPreço(this.preço - produto.getPreço());
		listaDeProdutos.remove(produto);
	}
	
	public boolean produtoEstaNaLista(Produto produto){
		return listaDeProdutos.contains(produto);
	}	
	
	public double getPreço(){
		for(Produto p:  listaDeProdutos){
			preço += p.getPreço();
		}
		return preço;
	}
	
	private void setPreço(double preço){
		this.preço = preço;
	}
	
	@Override
	public String toString() {
		return "ListaDeProdutos [listaDeProdutos=" + listaDeProdutos
				+ ", preço=" + preço + "]";
	}
	
}
