package com.patrones.software.creacionales.builder;

import org.junit.Test;

import com.patrones.software.creacionales.builder.Usuario;

public class BuilderTest {

	@Test
	public void test1() {

		// SIN BUILDER
//		Usuario user = new Usuario (username, contrasena, nombre, apellido, direccion, telefono)
		// pregunta de examen!!!!!
		Usuario usuario = Usuario.crearUsuario("ae.perez", "12345")
				
				usuario.in
				
				.setMedioContacto(true)
				.setDireccion("Ambato")
				.build();

		System.out.println(usuario);

	}
	@Test
	public void test2() {

		Usuario usuario = Usuario.crearUsuario("ae.perez", "12345")
				.setMedioContacto(false).build();
		System.out.println(usuario);
		

	}

}
