package com.patrones.software.estructurales.adapter;

public interface IConexionBD {

	// crear una conexion a la BD
	public void conexion();

	// ejecutar una consulta en la BD
	public String ejecutarConsulta();

}
