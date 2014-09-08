package model;

import java.util.*;

public class ListaDeProdutos{

	private List<Produto> listaDeProdutos;
	private double preco;
	private String nome;
	
	public ListaDeProdutos(String nome){
		this.nome = nome;
		listaDeProdutos = new ArrayList<Produto>();
		preco = 0;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void adicionaProduto(Produto produto){
		setPreco(this.preco + produto.getPreco());
		listaDeProdutos.add(produto);
	}
	
	public void removeProduto(Produto produto){
		setPreco(this.preco - produto.getPreco());
		listaDeProdutos.remove(produto);
	}
	
	public boolean produtoEstaNaLista(Produto produto){
		return listaDeProdutos.contains(produto);
	}	
	
	public double getPreco(){
		for(Produto p:  listaDeProdutos){
			preco += p.getPreco();
		}
		return preco;
	}
	
	private void setPreco(double preco){
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "ListaDeProdutos [listaDeProdutos=" + listaDeProdutos
				+ ", preco=" + preco + "]";
	}
	
}
