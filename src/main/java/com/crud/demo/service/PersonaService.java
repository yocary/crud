package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.interfaceService.IpersonaService;
import com.crud.demo.interfaces.IPersona;
import com.crud.demo.modelo.Persona;

@Service
public class PersonaService implements IpersonaService {

	@Autowired
	private IPersona data;

	@Override
	public List<Persona> listar() { // la variable listar hace la conexion o me manda a llamar la tabla persona en mi base de datos 
		return (List<Persona>) data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {

		return data.findById(id);
	}

	@Override
	public int save(Persona p) { // aqui se guardan 
		int res = 0;
		Persona persona = data.save(p);
		if (!persona.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) { // aqui se eliminan
		data.deleteById(id);

	}

}
