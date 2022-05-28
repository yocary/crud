package com.crud.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
        private String Apellido;
        private String telefono;
	
	
	public Persona() { // Noombre de mi tabla mysql

	}


	public Persona(int id, String name, String telefono) {
		super();
		this.id = id;// campos de mi tabla
		this.name = name;//campo de mi tabla
                this.Apellido = Apellido;//campo de mi tabla
		this.telefono = telefono;//campo de mi tabla
	}


	public int getId() { // se inicializa el id
		return id; // retornandome a id         
	}


	public void setId(int id) { // se permite el acceso a mi variable id
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

       public String getApellido() {
		return Apellido;
	}


	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}

	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
}
