package com.rodrigo.controledeprocedimentosModel;
import java.util.Map;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "paciente")
public class paciente {
	
	private String sexo;
	private String idade;
	private String id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigo;


	
	
	
	public static paciente getId() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getIdade() {
		return idade;
	}



	public void setIdade(String idade) {
		this.idade = idade;
	}



	public void setId(String id) {
		this.id = id;
	}



	public static boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
