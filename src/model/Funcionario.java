package model;

public class Funcionario 
{
	private String nome;
	private String cpf;
	private double salario;
	private Empresa empresa;
	
	public Funcionario(String Nome)
	{
		this.nome = Nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String Nome){
		this.nome = Nome;
	}
	
	
	public String getCpf(){
		return this.cpf;
	}
	
	public void setCpf(String Cpf){
		this.cpf = Cpf;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public void setSalario(double fSalario){
		this.salario = fSalario;
	}
	
	public Empresa empresa(){
		return this.empresa;
	}
	
	public void setEmpresa(Empresa empresa){
		this.empresa = empresa;
	}
}