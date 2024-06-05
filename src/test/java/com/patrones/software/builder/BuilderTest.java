package com.patrones.software.builder;

import org.junit.Test;

import com.patrones.software.creaciones.builder.Usuario;

public class BuilderTest {

	@Test
	public void test1() {
		
		// SIN BUILDER
//		Usuario user = new Usuario (username, contrasena, nombre, apellido, direccion, telefono)
		//pregunta de examen!!!!!
		Usuario usuario = Usuario.crearUsuario("ae.perez", "12345");
		//pregunta de examen cual es la diferencia entre crear usuario y crear uusario con build
		Usuario usuario2 = Usuario.crearUsuario("ae.perez", "12345")
							.setNombre("Juan").build();
		System.out.println(usuario);
		System.out.println(usuario2);
		
	}

}
