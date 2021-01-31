package com.rodrigo.controledeprocedimentosService;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import com.rodrigo.controledeprocedimentosModel.*;


	
	@Service
	public class pacienteservice {

		@Autowired
		private pacienterepositorio pacienterepository;


		public paciente atualizar(String codigo, paciente pessoa) {
			paciente pacienteSalva = buscarPacientePeloCodigo(codigo);
			BeanUtils.copyProperties(pessoa, pacienteSalva, "codigo");
			
			return pacienterepository.save(pacienteSalva);
		}


		private paciente buscarPacientePeloCodigo(String codigo) {
			Optional<paciente> pacienteSalva = pacienterepository.findById(codigo);
			
			if (!paciente.isPresent()) {
				throw new EmptyResultDataAccessException(1);
			}
			return paciente.getId();
		}
	}



