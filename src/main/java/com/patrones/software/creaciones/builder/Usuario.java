package com.patrones.software.creaciones.builder;

public class Usuario {

	// regla de negocio: Nombre y apellido es requerido para crear un usuario
	private String username;
	private String contrasena;

	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String direccion;

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

	public String getEmail() {
		return email;
	}

	public Usuario setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getTelefono() {
		return telefono;
	}

	public Usuario setTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}

	public String getDireccion() {
		return direccion;
	}

	public Usuario setDireccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

	private Usuario(String username, String contrasena) {
		this.username = username;
		this.contrasena = contrasena;
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

}
