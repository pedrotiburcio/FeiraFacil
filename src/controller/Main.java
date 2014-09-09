package controller;

import util.CategoriaDeProduto;
import model.*;

public class Main {

	//Testando as funcionalidades principais do sistema
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Sistema s = new Sistema();
		
		Usuario u1 = new Usuario("Pedro", "27.03.1998", "030405010-42", "3386 1323", "pedro@msn.com");
		s.cadastraUsuario(u1);
		

		Produto cervejaSkolLatao473ML = new Produto("Cerveja Skol Latao 473ml", 2.00 , CategoriaDeProduto.BEBIDAS_ALCOOLICAS);
		Produto vodkaAbsolut1L = new Produto("Vodka Absolut 1L", 2.00 , CategoriaDeProduto.BEBIDAS_ALCOOLICAS);
		Produto cadeiraTramontinaModeloRL = new Produto("Cadeira Tramontina Modelo RL", 2.00 , CategoriaDeProduto.EQUIPAMENTOS_INSUMOS_E_SERVICOS);
		Produto refrigeranteGuaranaAntartica2L = new Produto("Guarana Antartica 2L", 4.50 , CategoriaDeProduto.BEBIDAS_NAO_ALCOOLICAS);
		Produto sabaoEmPoOmo500G = new Produto("Sabao Em PO Omo", 3.00 , CategoriaDeProduto.LIMPEZA);
		
		ListaDeProdutos lista1 = new ListaDeProdutos("feira semanal");
		lista1.adicionaProduto(cervejaSkolLatao473ML);
		System.out.println(lista1.toString());
		lista1.removeProduto(cervejaSkolLatao473ML);
		System.out.println(lista1.toString());
		lista1.adicionaProduto(vodkaAbsolut1L);
		lista1.adicionaProduto(cadeiraTramontinaModeloRL);
		lista1.adicionaProduto(refrigeranteGuaranaAntartica2L);
		lista1.adicionaProduto(sabaoEmPoOmo500G);
		System.out.println(lista1.toString());
			
		u1.adicionaListaNoConjuntoDeListas(lista1);
		u1.adicionaListaNoCarrinho("feira semanal");
		System.out.println(u1.estaListaNoCarrinho("feira semanal"));
		System.out.println(u1.confirmaFeira("feira semanal", "sim"));
		
		System.out.println(lista1.getPreco());
		
	}

}
