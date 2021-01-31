package com.rodrigo.controleprocedimentosController;

import com.rodrigo.controledeprocedimentosModel.procedimentos;
import com.rodrigo.controledeprocedimentosModel.*;
import com.rodrigo.controledeprocedimentosService.*;

public class autorizador extends procedimentos{
	
	
	private int [] procedimento1234 = {10,11,12,13,14,15,16,17,18,19,20};
	private int [] procedimento4567 = {20,21,22,23,24,25,26,27,28,29,30};
	private int[] procedimento6789 = {10,11,12,13,14,15,16,17,18,19,20};
	
	public boolean procedimento1234equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		paciente other = (paciente) obj;
		if (procedimento1234 != null && compareTo( procedimento4567, procedimento6789)); {
				return true;
		} 
	}

	private boolean compareTo(int[] procedimento45672, int[] procedimento67892) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
