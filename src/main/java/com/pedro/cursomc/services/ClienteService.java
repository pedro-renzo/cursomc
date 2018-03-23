package com.pedro.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.cursomc.domain.Cliente;
import com.pedro.cursomc.repositories.ClienteRepository;
import com.pedro.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository categoriaRepository;
	
	public Cliente buscar(Integer id) {
		Cliente categoria = categoriaRepository.findOne(id);
		
		if (categoria == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + " Tipo: " + Cliente.class.getName());
		}
		
		return categoria;
	}
	
}
