package com.rodrigo.controledeprocedimentosService;

import java.util.ArrayList;
import java.util.Scanner;
import org.hibernate.mapping.Array;
import com.rodrigo.controledeprocedimentosModel.paciente;

public class cadastro {
	
	int op;
	String  sexo, idade, Id, p;
	Scanner sc = new Scanner(System.in);		
      int i= sc.nextInt();{	
	
	do{ 
		System.out.println("-------------------------");
		System.out.println("MENU PRINCIPAL");
		System.out.println("-------------------------");
		System.out.println("1 - CADASTRAR PACIENTE");
		System.out.println("2 - BUSCAR PACIENTE");
		System.out.println("3 - SAIR");
		System.out.println("Digite sua opção: ");
		op = sc.nextInt();
			
		switch (op) {
		
		case 1:
			paciente p1 = new paciente(); 
			System.out.println("Digite o numero de indenficacao do paciente:");
			System.out.flush(); 
			Id = sc.next();
			p1.setId(Id);
						
			System.out.println("Qual o sexo: ");
			System.out.flush();
			sexo = sc.next();
			p1.setSexo(sexo);
				
			System.out.println("Qual a idade: ");
			System.out.flush();
			idade = sc.next();
			p1.setIdade(idade);
				
			p.add(p1);
				
			break;
			
		case 2:
			System.out.println("Digite o Identificacao do paciente: "); 
			System.out.flush();
			Id = sc.next();
			boolean find=false;
			for (int i=0; i<p.length();i++){
				paciente currentPaciente = (paciente) p.get(paciente);
				if (paciente.getId().equals(Id)){
					System.out.println("identificacao: "+paciente.getId());
					System.out.println("Idade: "+currentPaciente.getIdade());
					System.out.println("Sexo: "+currentPaciente.getSexo());						
					find=true;
					
					break;
					}
				}
		
			if (!find){
				System.out.println("Paciente não encontrado!");					
			}								
			break;
			
					
		case 3:
			System.out.println("Saindo..");
			System.exit(0);
			break;
		
		default:
			System.out.println("Opção inválida!");
			
			break;
			
		}			
	}while (op!=3);	
	
      
	
}
}
