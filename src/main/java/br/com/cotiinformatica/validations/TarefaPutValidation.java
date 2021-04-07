package br.com.cotiinformatica.validations;

import java.util.ArrayList;
import java.util.List;

import br.com.cotiinformatica.dtos.TarefaPutDTO;

public class TarefaPutValidation {
	
	public List<String> validate(TarefaPutDTO dto){
		
		List<String> result = new ArrayList<String>();
		
		//validação do campo idTarefa
		if(dto.getIdTarefa() == null || dto.getIdTarefa() == 0) {
			result.add("Id da tarefa não encontrado.");
		}
		
		//validação do campo nome
		if(dto.getNome() == null || dto.getNome().length() == 0) {
			result.add("Por favor, informe o nome da tarefa.");
		}
		
		//validação do campo dataInicio
		if(dto.getDataInicio() == null) {
			result.add("Por favor, informe a data de início da tarefa.");
		}
		
		//validação do campo dataFim
		if(dto.getDataFim() == null){
			result.add("Por favor, informe a data de término da tarefa.");
		}
		
		//validação do campo descricao
		if(dto.getDescricao() == null || dto.getDescricao().length() == 0) {
			result.add("Por favor, informe a descrição da tarefa.");
		}
		
		return result;
	}
	
}
