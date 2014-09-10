package model;

import java.util.*;

public class ListaDeProdutos{

	private List<Produto> listaDeProdutos;
	// TODO lembrar de recalcular esse valor (o preço) quando necessario, pois pode mudar 
	// dependendo do dia, soh eh bom armazenar para saber se a feira esta ou nao mais barata
	private double precoTotal;
	private String nome;
	
	public ListaDeProdutos(String nome){
		this.nome = nome;
		listaDeProdutos = new ArrayList<Produto>();
		precoTotal = 0;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void adicionaProduto(Produto produto){
		setPreco(this.precoTotal + produto.getPreco());
		listaDeProdutos.add(produto);
	}
	
	public void removeProduto(Produto produto){
		setPreco(this.precoTotal - produto.getPreco());
		listaDeProdutos.remove(produto);
	}
	
	public boolean produtoEstaNaLista(Produto produto){
		return listaDeProdutos.contains(produto);
	}	
	
	// TODO quando o produto eh adicionado ja modifica a variavel, entao nao precisa incrementar de novo
//	public double getPreco(){
//		for(Produto p:  listaDeProdutos){
//			preco += p.getPreco();
//		}
//		return preco;
//	}
	
	public double getPreco(){
		return precoTotal;
	}
	
	private void setPreco(double preco){
		this.precoTotal = preco;
	}
	
	@Override
	public String toString() {
		return "ListaDeProdutos [listaDeProdutos=" + listaDeProdutos + ", preco=" + precoTotal + "]";
	}
	
	@Override
	public boolean equals(Object lista) {
		return this.nome.equalsIgnoreCase(((ListaDeProdutos)lista).getNome());
	}
}
