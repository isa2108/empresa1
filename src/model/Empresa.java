package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nome;
	private String cnpj;
	private List<Funcionario> funcionario;
	
	public Empresa(String Nome, String Cnpj){
		this.nome = Nome;
		this.cnpj = Cnpj;
		this.funcionario = new ArrayList<Funcionario>();
	}
	
	public void adicionaFuncionario(Funcionario Funcionario, int qtd){
		if(this.funcionario.size() < qtd){
			this.funcionario.add(Funcionario);
		}
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String Nome){
		this.nome = Nome;
	}
	
	public String getCnpj(){
		return this.cnpj;
	}
	
	public void setCnpj(String Cnpj){
		this.cnpj = Cnpj;
	}
	
	public List<Funcionario>getFuncionario(){
		return this.funcionario;
	}

	public void setFuncionario(List<Funcionario> Funcionario){
		this.funcionario = Funcionario;
	}

}