package controller;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class Sistema {

	Usuario usuario;
	List<Usuario> listaDeUsuarios;
	
	public Sistema() {
		listaDeUsuarios = new ArrayList<Usuario>();
	}
	
	public void cadastraUsuario(Usuario usuario){
		if(!contemUsuario(usuario)){
			this.usuario = usuario;
			listaDeUsuarios.add(this.usuario);
		}
	}
	
	public void removeUsuario(Usuario usuario){
		if(contemUsuario(usuario)){
			listaDeUsuarios.remove(usuario);
		}	
	}
	
	public boolean contemUsuario(Usuario usuario){
		return listaDeUsuarios.contains(usuario);
	}
	
	public Usuario pesquisaUsuario(Usuario usuario){
		if(!contemUsuario(usuario)){
			return null;
		}
		return usuario;
	}
	
	public String exibeListaDeUsuariosCadastrados(){
		return listaDeUsuarios.toString();
	}
}