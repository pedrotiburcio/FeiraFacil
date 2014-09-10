package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario { // TODO talvez nem seja necessário para a entrega na disciplina
	// TODO realmente eh necessario todas essa informacoes? Por mim soh deveria ter o nome e identidade (Pedro Victor)
	private String nome, telefone, email, dataNasc, cpf, rg;
// TODO private List<ListaDeProdutos> conjuntoDeListas; // descomentar depois de completar a disciplina
	private Carrinho carrinho; //TODO abolida?
	
	public Usuario(String nome, String dataNascimento, String cpf, String telefone, String email) {
		this.nome = nome;
		this.dataNasc = dataNascimento;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
//TODO		conjuntoDeListas = new ArrayList<ListaDeProdutos>(); // descomentar depois de completar a disciplina
		carrinho = new Carrinho();
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String setNome(String usuario){
		return this.nome = usuario;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	//TODO ALERTA, o usuario nao eh responsavel por essas funcoes abaixo
/*		public void adicionaListaNoConjuntoDeListas(ListaDeProdutos lista){
		conjuntoDeListas.add(lista);
	}
	public void removeListaDoConjuntoDeListas(String nome){
		int tamanhoAntesDaRemocao = conjuntoDeListas.size();
		for(ListaDeProdutos l : conjuntoDeListas){
			if(l.getNome().equals(nome)){
				conjuntoDeListas.remove(l);
			}
		}
		if(conjuntoDeListas.size() == tamanhoAntesDaRemocao){
			System.out.println("Lista não encontrada.");
		}
	}
	
	public ListaDeProdutos pesquisaLista(String nome){
		for(ListaDeProdutos l : conjuntoDeListas){
			if(l.getNome().equals(nome)){
				return l;
			}
		}
		return null;
	}	
	
	public boolean temALista(String nome){
		if(!nome.equals(null)){
			if(pesquisaLista(nome).getNome() == nome){
				return true;
			}
		}
		return false;
	}
	
	public void adicionaListaNoCarrinho(String nome){
		if(temALista(nome)){
			carrinho.adicionaFeira(pesquisaLista(nome));
		}
	}
	
	public void removeListaDoCarrinho(String nome){
		if(temALista(nome)){
			carrinho.removeFeira(pesquisaLista(nome));
		}
	}
	
	public boolean estaListaNoCarrinho(String nome){
		if(carrinho.TemAFeira(nome)){
			return true; 
		}
		return false;
	}
	
	public boolean confirmaFeira(String nome, String confirma){
		if(estaListaNoCarrinho(nome) && confirma.equals("sim")){
			return true;
		}
		return false;
	}
*/	
	
	
	public String toString(){
		return this.nome + this.telefone;
	}
	
}