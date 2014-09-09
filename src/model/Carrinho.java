package model;

import java.util.ArrayList;
import java.util.List;
// TODO pode ser abolido
public class Carrinho {
	
	private List<ListaDeProdutos> carrinho;
	
	public Carrinho(){
		carrinho = new ArrayList<ListaDeProdutos>();
	}

	public void adicionaFeira(ListaDeProdutos lista){
		this.carrinho.add(lista);
	}
	
	public void removeFeira(ListaDeProdutos lista){
		this.carrinho.remove(lista);
	}
	
	public boolean TemAFeira(String nome){
		for(ListaDeProdutos l : carrinho){
			if(l.getNome().equals(nome)){
				return true; 
			}
		}
		return false;
	}
	 
}
