package view;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import model.Funcionario;
import model.Empresa;

public class Main {

    public static void main(String[] args) {
    	
    	int aux = 1;
        	
        Scanner entrada = new Scanner(System.in);
        	 
        System.out.print("Digite o nome da Empresa: ");
        String Nome = entrada.next();

        System.out.print("Digite o CNPJ da empresa: ");
        String cnpj = entrada.next();
             
        Empresa empresa1 = new Empresa(Nome, cnpj);
        
             
        System.out.print("Digite o número de funcionarios que trabalham na empresa: ");
        int qtd = entrada.nextInt();
        
        System.out.println("");
             
        do{
        	
        	System.out.print("Digite o nome do funcionario: ");
        	String nome = entrada.next();
             
	        System.out.print("Digite o CPF do funcionário: ");
	        String cpf = entrada.next();
	
	        System.out.print("Digite o salário do funcionário: ");
	        double salario = entrada.nextDouble();
	        
	        System.out.println("");
	             
	        Funcionario funcionario1 = new Funcionario(nome);
	             
	        funcionario1.setCpf(cpf);
	        funcionario1.setSalario(salario);
	        
	        System.out.println("Nome da empresa: " + empresa1.getNome());
	        System.out.println("CNPJ: " + empresa1.getCnpj());
	        

        	System.out.println("Nome do funcionário: " + funcionario1.getNome());
        	System.out.println("CPF: " +funcionario1.getCpf());
        	System.out.println("Salário: " +funcionario1.getSalario());
        	System.out.println("");
        	
        	aux++;

        }while(aux <= qtd);
    }
}
