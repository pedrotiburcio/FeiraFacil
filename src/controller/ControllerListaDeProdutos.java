package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.ListaDeProdutos;
import model.Produto;

public class ControllerListaDeProdutos {

	private List<ListaDeProdutos> todasAsListas;
	private ListaDeProdutos listaAtual;
	
	public ControllerListaDeProdutos() {
		todasAsListas = new ArrayList<ListaDeProdutos>();
	}
	
	public void novoCarrinho(){
		listaAtual = new ListaDeProdutos("Lista atual");
	}
	
	public void salvarLista() {
		//compara pelo nome, nao pelos produtos, eh melhor caso eu queira editar minha lista
		if (todasAsListas.contains(listaAtual)) {
			removeLista(listaAtual);
		} 
		todasAsListas.add(listaAtual);
	}
	
	public void removeLista(String nomeDaLista) {
		todasAsListas.remove(pesquisarLista(nomeDaLista));
	}
	
	public void removeLista(ListaDeProdutos lista){
		todasAsListas.remove(lista);
	}
	
	public ListaDeProdutos pesquisarLista(String nomeDaLista) {
		Iterator<ListaDeProdutos> it = todasAsListas.iterator();
		while (it.hasNext()) {
			ListaDeProdutos lista = (ListaDeProdutos) it.next();
			if (lista.equals(nomeDaLista)) {
				return lista;
			}
		}
		return null; // tomar cuidado
	}
	
	public List<Produto> pesquisarProduto(Produto prod){
		/* TODO falta implementar. 
		Qual o sentido desse metodo?
		Sera apenas na lista atual?
		Eh para retornar um lista de listas que contem esse produto?
		*/
		return null;
	}
	
	public void atualizarProduto(Produto produto) {
		// TODO falta implementar. 
		// Atualizar o que exatamente e em que lista? Na atual ou em todas?
	}
	
	public void adicionaProduto(Produto produto){
		listaAtual.adicionaProduto(produto);
	}
	
	public void removerProduto(Produto produto) {
		listaAtual.removeProduto(produto);
	}
	
}