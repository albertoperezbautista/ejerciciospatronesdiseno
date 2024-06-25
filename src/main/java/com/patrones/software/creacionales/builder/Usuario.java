package com.patrones.software.creacionales.builder;

import com.patrones.software.creacionales.abstractfactory.AppleStoreFactory;

public class Usuario extends AppleStoreFactory{

	// regla de negocio: Nombre y apellido es requerido para crear un usuario
	private String username;
	private String contrasena;

	// regla de negocio: Si el medio de contacto tiene un valor verdadero
		// el cliente podra asignar valores para mail, telefono y direcion
		// si el medio de contacto es falso no se habilitaran lo setters de los
		// atributos
	
	private boolean medioContacto; // opcional

	
	/*
	 * 
	 */
	
	

	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String direccion;

	public boolean getMedioContacto() {
		return medioContacto;
	}

	public BuilderUsuario setMedioContacto(boolean medioContacto) {
		if(!medioContacto) {
			throw new IllegalArgumentException("NO es posible asignar un valor falso a medio de contacto");
		}
						
		this.medioContacto = medioContacto;
		return new BuilderUsuario(this);
	}

	public String getNombre() {
		return nombre;
	}

	public Usuario setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public String getApellido() {
		return apellido;
	}

	public Usuario setApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}

	

	private Usuario(String username, String contrasena) {
		this.username = username;
		this.contrasena = contrasena;
		this.medioContacto = false;
	}

	public static Usuario crearUsuario(String username, String contrasena) {
		return new Usuario(username, contrasena);
	}

	// ESTE METODO ES UN METODO DE INSTANCIA
	public Usuario build() {
		return this;

	}

	@Override
	public String toString() {
		return "Usuario [username=" + username + ", contrasena=" + contrasena + ", nombre=" + nombre + ", apellido="
				+ apellido + ", email=" + email + ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}

	// crear una nueva clase dentro de mi misma clase

	public static class BuilderUsuario {
		private Usuario usuario;

		public BuilderUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		
//		public String getEmail() {
//			return email;
//		}

		public BuilderUsuario setEmail(String email) {
			usuario.email = email;
			return this;
		}

//		public String getTelefono() {
//			return telefono;
//		}

		public BuilderUsuario setTelefono(String telefono) {
			usuario.telefono = telefono;
			return this;
		}

//		public String getDireccion() {
//			return direccion;
//		}

		public BuilderUsuario setDireccion(String direccion) {
			usuario.direccion = direccion;
			return this;
		}

		public Usuario build() {
			return usuario;
		}
	}

}
